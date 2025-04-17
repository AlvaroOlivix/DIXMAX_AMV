package com.example.dixmax_amv.features.serie.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dixmax_amv.features.serie.domain.Category


private const val TABLE_NAME = "tableSeries"

@Entity(TABLE_NAME)
data class SerieEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "categories") val categories: List<Category>,
    @ColumnInfo(name = "released") val released: String,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "rated") val rated: String,
    @ColumnInfo(name = "seasons") val seasons: String,
    @ColumnInfo(name = "poster") val poster: String,
    @ColumnInfo(name = "score") val score: String,
    @ColumnInfo(name = "bookMark") val bookMark: Boolean
)