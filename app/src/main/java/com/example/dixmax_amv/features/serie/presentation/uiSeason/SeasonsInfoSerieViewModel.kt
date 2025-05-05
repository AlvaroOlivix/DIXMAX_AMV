package com.example.dixmax_amv.features.serie.presentation.uiSeason

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.serie.domain.GetSerieUseCase
import com.example.dixmax_amv.features.serie.domain.Serie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class SeasonsInfoSerieViewModel(private val getSerieUseCase: GetSerieUseCase) : ViewModel() {

    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    private var serieLoaded: Serie? = null
    fun getInfo(serieId: String) {
        viewModelScope.launch(Dispatchers.IO) {
            serieLoaded = getSerieUseCase(serieId)
            _uiState.postValue(UiState(serie = serieLoaded))
        }
    }

    data class UiState(
        val serie: Serie? = null
    )

}