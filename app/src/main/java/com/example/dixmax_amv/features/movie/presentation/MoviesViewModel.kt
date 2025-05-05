package com.example.dixmax_amv.features.movie.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.movie.domain.GetAllMoviesUseCase
import com.example.dixmax_amv.features.movie.domain.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MoviesViewModel(private val getAllMoviesUseCase: GetAllMoviesUseCase) : ViewModel() {
    private var _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    fun loadMovies() {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val list = getAllMoviesUseCase()
                Log.d("MoviesViewModel", "Películas cargadas: ${list.size}")
                _uiState.postValue(UiState(movies = list))
            } catch (e: Exception) {
                Log.d("error", "Error al cargar la lista de Peliculas")
                _uiState.postValue(UiState(error = true))
            }
        }
    }


    data class UiState(
        val movies: List<Movie> = emptyList(),
        val loading: Boolean = false,
        val error: Boolean = false
    )
}