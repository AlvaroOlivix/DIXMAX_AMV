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

    private var list: List<Movie> = emptyList()

    private var showFavorites: Boolean = false

    fun loadMovies() {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                list = getAllMoviesUseCase()
                Log.d("@dev", "VM : Películas cargadas -> ${list.size}")
                _uiState.postValue(UiState(movies = list))
            } catch (e: Exception) {
                Log.d("@dev", "VM: Error al cargar la lista de Peliculas")
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    fun setUpFavorite(movieCLicked: Movie) {
        viewModelScope.launch(Dispatchers.IO) {
            list = list.map { movie ->
                if (movie.id == movieCLicked.id) {
                    movie.copy(isFavorite = !movie.isFavorite)
                } else {
                    movie
                }
            }
            _uiState.postValue(UiState(movies = list))
        }
    }

    fun showFavorites() {
        showFavorites = !showFavorites
        viewModelScope.launch(Dispatchers.IO) {
            val showList = if (showFavorites) {
                list.filter { it.isFavorite }
            } else {
                list
            }
            _uiState.postValue(UiState(movies = showList))
        }
    }

    data class UiState(
        val movies: List<Movie> = emptyList(),
        val loading: Boolean = false,
        val error: Boolean = false
    )
}