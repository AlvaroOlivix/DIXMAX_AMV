package com.example.dixmax_amv.core.di

import android.content.Context
import com.example.dixmax_amv.core.db.DixmaxDataBase
import com.example.dixmax_amv.core.di.FireStoreProvider.provideFirestore
import com.example.dixmax_amv.features.enlace.data.local.LinkDao
import com.example.dixmax_amv.features.movie.data.local.room.MovieDao
import com.example.dixmax_amv.features.serie.data.local.room.SerieDao
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
@ComponentScan("com.example.dixmax_amv")
class AppModule {
    @Single
    fun provideDB(context: Context): DixmaxDataBase {
        return DataBaseProvider.provideDB(context)
    }

    @Single
    fun provideSerieDao(db: DixmaxDataBase): SerieDao {
        return db.serieDao()
    }

    @Single
    fun provideMovieDao(db: DixmaxDataBase): MovieDao {
        return db.movieDao()
    }

    @Single
    fun provideFirestore(): FirebaseFirestore {
        return FireStoreProvider.provideFirestore()
    }

    @Single
    fun provideLinkDao(db: DixmaxDataBase): LinkDao {
        return db.linkDao()
    }

}