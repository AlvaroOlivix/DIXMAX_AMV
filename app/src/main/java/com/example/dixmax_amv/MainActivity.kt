package com.example.dixmax_amv

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.dixmax_amv.core.di.DataBaseProvider
import com.example.dixmax_amv.core.di.FireStoreProvider
import com.example.dixmax_amv.databinding.ActivityMainBinding
import com.example.dixmax_amv.features.enlace.data.LinkDataRepository
import com.example.dixmax_amv.features.enlace.data.local.LinkLocalDataSource
import com.example.dixmax_amv.features.enlace.data.remote.LinkRemoteMockDataSource
import com.example.dixmax_amv.features.enlace.domain.Link
import com.example.dixmax_amv.features.movie.data.MovieDataRepository
import com.example.dixmax_amv.features.movie.data.MovieFirestoreDataRepository
import com.example.dixmax_amv.features.movie.data.local.room.LocalRoomDataSource
import com.example.dixmax_amv.features.movie.data.remote.mock.MockRemoteMoviesDataSource
import com.example.dixmax_amv.features.movie.data.remote.firestore.FirestoreMovieRemoteDataSource
import com.example.dixmax_amv.features.movie.domain.model.Award
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.example.dixmax_amv.features.serie.data.SeriesDataRepository
import com.example.dixmax_amv.features.serie.data.local.room.LocalDbSeriesDataSource
import com.example.dixmax_amv.features.serie.data.remote.MockSeriesRemoteDataSource
import com.example.dixmax_amv.features.serie.domain.Episode
import com.example.dixmax_amv.features.serie.domain.Season
import com.example.dixmax_amv.features.serie.domain.Serie
import com.google.android.material.navigation.NavigationBarView
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
        //executeFirestore()
        //executeDB()
    }

    private fun setupView() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment

        val navController = navHostFragment.navController

        binding.apply {
            mBottom.setupWithNavController(navController)
        }
    }

    /*
    PRUEBA DE FUNCIONAMIENTO DE FIRESTORE

    @OptIn(DelicateCoroutinesApi::class)
    private fun executeFirestore() {
        val mockAwards = listOf(
            Award("11", "Premio Cervantes", "2018"),
            Award("12", "Premio Pullitzer", "2019"),
            Award("13", "Premio Puskas", "2020"),
            Award("14", "Premio Goya", "2021")
        )
        val mockMovies = listOf(
            Movie(
                "01",
                "El Secreto de Marrowborn",
                "Pelicula de Culto española grabada en Galicia",
                "Url del poster",
                mockAwards[0]
            ),
            Movie(
                "02",
                "Corazones de acero",
                "Pelçicula bélica ambientada en la 2a guerra mundial",
                "Url del poster",
                mockAwards[1]
            ),
            Movie(
                "03",
                "Your name in april",
                "Pelicula animada de origen japones y creada por Eichiro Oda",
                "Url del poster",
                mockAwards[2]
            ),
            Movie(
                "04",
                "The Beekeper",
                "Protagonizada por Jason Statham en Villedor",
                "Url del poster",
                award = mockAwards[1]
            )
        )

        val fs = FireStoreProvider.provideFirestore()
        val guardarMock = FirestoreMovieRemoteDataSource(fs)
        val repo = MovieFirestoreDataRepository(FirestoreMovieRemoteDataSource(fs))

        GlobalScope.launch(Dispatchers.IO) {
            guardarMock.saveMovies(mockMovies)
            guardarMock.saveAwards(mockAwards)

            repo.saveMovies(mockMovies)
            Log.d("testFirestore", repo.getAllMovies().toString())

            repo.deleteMovie(mockMovies[1])
            Log.d("testFirestore", repo.getAllMovies().toString())
        }
    }
     */


    @OptIn(DelicateCoroutinesApi::class)
    fun executeDB() {
    }
}

