package com.example.dixmax_amv.features.serie.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.serie.domain.GetSerieUseCase
import com.example.dixmax_amv.features.serie.domain.Serie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class SerieDetailViewModel(private val getSerieUseCase: GetSerieUseCase) : ViewModel() {

    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    fun loadSerie(serieId: String) {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                Log.d("@dev", "Buscando serie con id: $serieId")
                val serieVM = getSerieUseCase(serieId)
                Log.d("@dev", "Serie cargada: $serieVM")

                withContext(Dispatchers.Main) {
                    _uiState.value = UiState(serie = serieVM)
                }
            } catch (e: Exception) {
                Log.e("@dev", "Error al cargar serie: ${e.message}", e)
                _uiState.postValue(UiState(error = true))
            }
        }

    }

    data class UiState(
        val serie: Serie? = null,
        val loading: Boolean = false,
        val error: Boolean = false
    )
}