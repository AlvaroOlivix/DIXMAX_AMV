package com.example.dixmax_amv.features.movie.data.remote.mock

import com.example.dixmax_amv.features.movie.domain.model.Award
import com.example.dixmax_amv.features.movie.domain.model.Movie
import org.koin.core.annotation.Single

@Single
class MockRemoteMoviesDataSource {

    private val mockAwards = listOf(
        Award("11", "Premio Cervantes", "2018"),
        Award("12", "Premio Pullitzer", "2019"),
        Award("13", "Premio Puskas", "2020"),
        Award("14", "Premio Goya", "2021")
    )
    private val mockMovies = listOf(
        Movie(
            "01",
            "El Secreto de Marrowborn",
            "Pelicula de Culto española grabada en Galicia",
            "https://th.bing.com/th/id/OIP.zyTQnF_idRp6SskbVhkk6AHaKx?w=203&h=295&c=7&r=0&o=5&pid=1.7", mockAwards[0]
        ),
        Movie(
            "02",
            "Corazones de acero",
            "Pelçicula bélica ambientada en la 2a guerra mundial",
            "https://th.bing.com/th/id/OIP.SUKpa6yAG-CPj2Upk8Or_QHaKp?w=120&h=180&c=7&r=0&o=5&pid=1.7", mockAwards[1]
        ),
        Movie(
            "03",
            "Your name in april",
            "Pelicula animada de origen japones y creada por Eichiro Oda",
            "https://th.bing.com/th/id/OIP.zyTQnF_idRp6SskbVhkk6AHaKx?w=203&h=295&c=7&r=0&o=5&pid=1.7", mockAwards[2]
        ),
        Movie(
            "04",
            "The Beekeper",
            "Protagonizada por Jason Statham en Villedor",
            "https://th.bing.com/th/id/OIP.zyTQnF_idRp6SskbVhkk6AHaKx?w=203&h=295&c=7&r=0&o=5&pid=1.7", mockAwards[3]
        ),
    )

    fun getAllMovies(): List<Movie> {
        return mockMovies
    }

    fun getMovieById(movieId: String): Movie? {
        return mockMovies.find { it.id == movieId }
    }
}