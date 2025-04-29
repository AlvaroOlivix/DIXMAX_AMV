package com.example.dixmax_amv.features.movie.domain

import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.example.dixmax_amv.features.movie.domain.model.MovieRepository
import org.koin.core.annotation.Single

@Single
class GetAllMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend operator fun invoke(): List<Movie> {
        return movieRepository.getAllMovies()
    }
}