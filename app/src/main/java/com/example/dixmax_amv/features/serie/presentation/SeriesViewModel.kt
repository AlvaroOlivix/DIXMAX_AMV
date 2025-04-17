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
    var isBookmarked: Boolean = false
    private var isNewest: Boolean = false
    private var isAged: Boolean = false

    fun loadAlbums() {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                updatedList = getSeriesUseCase()
                Log.d("@dev", "Lista cargada")
                _uiState.postValue(UiState(series = updatedList))
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
            _uiState.postValue(UiState(series = updatedList))
        }
    }

    fun showBookMarked() {
        isBookmarked = !isBookmarked
        viewModelScope.launch(Dispatchers.IO) {
            val bookmarkedSeries = if (isBookmarked) {

                updatedList.filter { it.bookMark }
            } else {
                updatedList
            }
            _uiState.postValue(UiState(series = bookmarkedSeries))
        }
    }

    fun showNewest() {
        isNewest = !isNewest
        viewModelScope.launch(Dispatchers.IO) {

            val markedNew = if (isNewest) {
                updatedList.filter { it.released.contains("2025") }
            } else {
                updatedList
            }
            _uiState.postValue(UiState(series = markedNew))
        }
    }

    fun showAgeRated() {
        isAged = !isAged
        viewModelScope.launch(Dispatchers.IO) {
            val aged = if(isAged){
                updatedList.filter { it.rated.contains("+18") }
            }else{
                updatedList
            }
            _uiState.postValue(UiState(series = aged))
        }
    }

    data class UiState(
        val series: List<Serie> = emptyList(),
        val loading: Boolean = false,
        val error: Boolean = false
    )
}