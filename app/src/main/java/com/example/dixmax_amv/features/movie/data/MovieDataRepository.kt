package com.example.dixmax_amv.features.movie.data

import androidx.collection.emptyLongSet
import com.example.dixmax_amv.features.movie.data.local.room.LocalRoomDataSource
import com.example.dixmax_amv.features.movie.data.remote.mock.MockRemoteMoviesDataSource
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.example.dixmax_amv.features.movie.domain.model.MovieRepository
import org.koin.core.annotation.Single

@Single
class MovieDataRepository(
    private val remoteData: MockRemoteMoviesDataSource,
    private val localData: LocalRoomDataSource
) : MovieRepository {
    override suspend fun getAllMovies(): List<Movie> {
        val localMovies = localData.getAllMovies()
        return if (localMovies.isEmpty()) {
            val remoteMovies = remoteData.getAllMovies()
            localData.saveMovies(remoteMovies)
            remoteMovies
        } else {
            localMovies
        }
    }

    override suspend fun getMovieById(movieId: String): Movie? {
        val localMovie = localData.getMovieById(movieId)
        return if (localMovie == null) {
            val remoteMovie = remoteData.getMovieById(movieId)
            if (remoteMovie != null) {
                localData.saveMovie(remoteMovie)
            }
            remoteMovie
        } else {
            localMovie
        }
    }

    override suspend fun saveMovie(movie: Movie) {
        localData.saveMovie(movie)
    }

    override suspend fun saveMovies(movies: List<Movie>) {
        localData.saveMovies(movies)
    }

    override suspend fun deleteMovie(movie: Movie) {
        localData.deleteMovie(movie)
    }

    override suspend fun updateMovie(movie: Movie) {
        localData.updateMovie(movie)
    }
}