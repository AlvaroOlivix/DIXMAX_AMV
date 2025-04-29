package com.example.dixmax_amv.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dixmax_amv.features.movie.data.local.room.MConverters
import com.example.dixmax_amv.features.movie.data.local.room.MovieDao
import com.example.dixmax_amv.features.movie.data.local.room.MovieEntity
import com.example.dixmax_amv.features.serie.data.local.room.SerieDao
import com.example.dixmax_amv.features.serie.data.local.room.SerieEntity


@Database(entities = [SerieEntity::class, MovieEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class, MConverters::class)
abstract class DixmaxDataBase : RoomDatabase() {
    abstract fun serieDao(): SerieDao
    abstract fun movieDao(): MovieDao
}