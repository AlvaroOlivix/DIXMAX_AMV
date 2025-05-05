package com.example.dixmax_amv.features.serie.presentation.uiHome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.movie.domain.GetAllMoviesUseCase
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.example.dixmax_amv.features.serie.domain.GetSeriesUseCase
import com.example.dixmax_amv.features.serie.domain.Serie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class HomeViewModel(
    val getSeriesUseCase: GetSeriesUseCase,
    val getMoviesUseCase: GetAllMoviesUseCase
) : ViewModel() {

    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    private var seriesLoaded: List<Serie> = emptyList()
    private var moviesLoaded: List<Movie> = emptyList()

    fun getHomeLoad() {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                seriesLoaded = getSeriesUseCase()
                moviesLoaded = getMoviesUseCase()
                _uiState.postValue(UiState(series = seriesLoaded, movies = moviesLoaded))
            } catch (e: Exception) {
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    data class UiState(
        val loading: Boolean = false,
        val error: Boolean = true,
        val series: List<Serie> = emptyList(),
        val movies: List<Movie> = emptyList()
    )
}