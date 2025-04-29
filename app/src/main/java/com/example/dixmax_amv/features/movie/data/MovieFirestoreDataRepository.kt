package com.example.dixmax_amv.features.movie.data

import com.example.dixmax_amv.features.movie.data.remote.firestore.FirestoreMovieRemoteDataSource
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.example.dixmax_amv.features.movie.domain.model.MovieRepository

class MovieFirestoreDataRepository(private val dataSource: FirestoreMovieRemoteDataSource) :
    MovieRepository {
    override suspend fun getAllMovies(): List<Movie> {
        return dataSource.getAllMovies()
    }

    override suspend fun getMovieById(movieId: String): Movie? {
        return dataSource.getMovieById(movieId)
    }

    override suspend fun saveMovie(movie: Movie) {
        dataSource.saveMovie(movie)
    }

    override suspend fun saveMovies(movies: List<Movie>) {
        dataSource.saveMovies(movies)
    }

    override suspend fun deleteMovie(movie: Movie) {
        dataSource.deleteMovie(movie)
    }

    override suspend fun updateMovie(movie: Movie) {
        dataSource.updateMovie(movie)
    }
}