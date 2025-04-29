package com.example.dixmax_amv.features.movie.domain.model

interface MovieRepository {
    suspend fun getAllMovies(): List<Movie>
    suspend fun getMovieById(movieId: String): Movie?
    suspend fun saveMovie(movie: Movie)
    suspend fun saveMovies(movies:List<Movie>)
    suspend fun deleteMovie(movie: Movie)
    suspend fun updateMovie(movie: Movie)
}