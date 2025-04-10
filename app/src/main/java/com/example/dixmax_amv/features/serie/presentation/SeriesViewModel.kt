package com.example.dixmax_amv.features.serie.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.serie.domain.GetSeriesUseCase
import com.example.dixmax_amv.features.serie.domain.Serie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class SeriesViewModel(val getSeriesUseCase: GetSeriesUseCase) : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> get() = _uiState

    private var updatedList: List<Serie> = emptyList()

    fun loadAlbums() {
        Log.d("@dev", "Se ha llamado a loadAlbums()")
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val loaded = getSeriesUseCase()
                Log.d("@dev", "Lista cargada")
                _uiState.postValue(loaded?.let { UiState(series = it) })
            } catch (e: Exception) {
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    fun toggleBookmark(serie: Serie) {
        viewModelScope.launch(Dispatchers.IO) {
            updatedList = updatedList.map {
                if (it.id == serie.id) serie.copy(bookMark = !serie.bookMark) else it
            }
        }
    }

    data class UiState(
        val series: List<Serie> = emptyList(),
        val loading: Boolean = false,
        val error: Boolean = false
    )
}