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
            "https://th.bing.com/th/id/OIP.zyTQnF_idRp6SskbVhkk6AHaKx?w=203&h=295&c=7&r=0&o=5&pid=1.7",
            mockAwards[0],
            false
        ),
        Movie(
            "02",
            "Corazones de acero",
            "Pelçicula bélica ambientada en la 2a guerra mundial",
            "https://th.bing.com/th/id/OIP.SUKpa6yAG-CPj2Upk8Or_QHaKp?w=120&h=180&c=7&r=0&o=5&pid=1.7",
            mockAwards[1], false
        ),
        Movie(
            "03",
            "Your lie in april",
            "Pelicula animada de origen japones y creada por Eichiro Oda",
            "https://statics.viralizalo.com/virs/2018/12/VIR_440842_33013_quien_eres_de_shigatsu_wa_kimi_no_uso_your_lie_in_april.jpg?cb=8552874",
            mockAwards[2], false
        ),
        Movie(
            "04",
            "The Beekeper",
            "Protagonizada por Jason Statham en Villedor",
            "https://pics.filmaffinity.com/the_beekeeper-779745802-large.jpg", mockAwards[3], false
        ),
        Movie(
            "05",
            "It",
            "Pelicula de culto de terror fantástico",
            "https://th.bing.com/th/id/OIP.u2k6al3dUi_St8XmtnK0KQAAAA?rs=1&pid=ImgDetMain",
            mockAwards[3],
            false
        ), Movie(
            "06",
            "Smile 2",
            "Secuela de la saga Smile",
            "https://mlpnk72yciwc.i.optimole.com/cqhiHLc.IIZS~2ef73/w:auto/h:auto/q:75/https://bleedingcool.com/wp-content/uploads/2024/06/S2_DOM_2025x3000_ONLINE_TEASER_ONE_SHEET_TORN_rgb.jpg",
            mockAwards[3],
            false
        )
    )

    fun getAllMovies(): List<Movie> {
        return mockMovies
    }

    fun getMovieById(movieId: String): Movie? {
        return mockMovies.find { it.id == movieId }
    }
}