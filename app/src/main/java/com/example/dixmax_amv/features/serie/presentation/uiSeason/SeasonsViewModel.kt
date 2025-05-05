package com.example.dixmax_amv.features.serie.presentation.uiSeason

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.serie.domain.Episode
import com.example.dixmax_amv.features.serie.domain.GetSerieUseCase
import com.example.dixmax_amv.features.serie.domain.Season
import com.example.dixmax_amv.features.serie.domain.Serie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class SeasonsViewModel(private val getSerieUseCase: GetSerieUseCase) : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> get() = _uiState

    private var serieLoaded: Serie? = null
    private var episodesLoaded: List<Episode> = emptyList()

    fun getSeasons(serieId: String) {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                serieLoaded = getSerieUseCase(serieId)
                episodesLoaded = serieLoaded?.seasons?.firstOrNull()?.episodes ?: emptyList()
                _uiState.postValue(UiState(serie = serieLoaded, episodes = episodesLoaded))
            } catch (e: Exception) {
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    fun selectSeason(index: Int) {
        episodesLoaded = serieLoaded?.seasons?.getOrNull(index)?.episodes ?: emptyList()
        _uiState.value = _uiState.value?.copy(episodes = episodesLoaded)
    }

    data class UiState(
        val season: Season? = null,
        val serie: Serie? = null,
        val episodes: List<Episode> = emptyList(),
        val loading: Boolean = false,
        val error: Boolean = false
    )
}