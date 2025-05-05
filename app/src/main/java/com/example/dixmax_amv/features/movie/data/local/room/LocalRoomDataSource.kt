package com.example.dixmax_amv.features.movie.data.local.room

import com.example.dixmax_amv.features.movie.domain.model.Movie
import org.koin.core.annotation.Single

@Single
class LocalRoomDataSource(private val movieDao: MovieDao) {
    suspend fun getAllMovies(): List<Movie> {
        return movieDao.getAll().map { it.toModel() }
    }

    suspend fun getMovieById(movieId: String): Movie? {
        return movieDao.getMovieById(movieId)?.toModel()
    }

    suspend fun saveMovie(movie: Movie) {
        movieDao.insert(movie.toEntity())
    }

    suspend fun saveMovies(movies: List<Movie>) {
        movieDao.insertAll(*movies.map { it.toEntity() }.toTypedArray())
    }

    suspend fun deleteMovie(movie: Movie) {
        movieDao.delete(movie.toEntity())
    }

    suspend fun updateMovie(movie: Movie) {
        movieDao.updateMovie(movie.toEntity())
    }
}