package com.example.dixmax_amv.features.movie.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dixmax_amv.features.movie.domain.model.Award

const val MOVIE_TABLE = "MovieTable"

@Entity(tableName = MOVIE_TABLE)
data class MovieEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "poster") val poster: String,
    @ColumnInfo(name = "award") val award: Award,
    @ColumnInfo(name = "isFavorite") val isFavorite: Boolean
)