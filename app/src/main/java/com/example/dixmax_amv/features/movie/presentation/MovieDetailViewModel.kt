package com.example.dixmax_amv.features.movie.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dixmax_amv.features.movie.domain.GetMovieByIdUseCase
import com.example.dixmax_amv.features.movie.domain.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MovieDetailViewModel(private val getMovieById: GetMovieByIdUseCase) : ViewModel() {

    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> get() = _uiState

    fun load(movieId: String) {
        _uiState.value = UiState(loading = true)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val mov = getMovieById(movieId)
                Log.d("@dev", "Movie cargada: $mov")
                _uiState.postValue(UiState(movie = mov))
            } catch (e: Exception) {
                Log.e("@dev", "Error cargando movieId: $movieId", e)
                _uiState.postValue(UiState(error = true))
            }
        }
    }

    data class UiState(
        val movie: Movie? = null,
        val error: Boolean = false,
        val loading: Boolean = false
    )
}