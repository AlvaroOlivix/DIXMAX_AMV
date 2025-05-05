package com.example.dixmax_amv.features.movie.domain

import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.example.dixmax_amv.features.movie.domain.model.MovieRepository
import org.koin.core.annotation.Single

@Single
class GetMovieByIdUseCase(val movieRepository: MovieRepository) {
    suspend operator fun invoke(movieId: String): Movie? {
        return movieRepository.getMovieById(movieId)
    }
}