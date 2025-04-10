package com.example.dixmax_amv.core.di

import android.content.Context
import com.example.dixmax_amv.core.db.DixmaxDataBase
import com.example.dixmax_amv.features.serie.data.local.room.SerieDao
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
}