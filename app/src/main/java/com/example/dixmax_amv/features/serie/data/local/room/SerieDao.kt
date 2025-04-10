package com.example.dixmax_amv.features.serie.data.local.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SerieDao {

    @Query("SELECT * FROM tableSeries")
    fun getAll(): List<SerieEntity>

    @Query("SELECT * FROM tableSeries WHERE id = :serieId")
    fun getById(serieId: String): SerieEntity

    @Insert
    fun saveSeries(vararg series: SerieEntity)

    @Insert
    fun saveSerie(serie: SerieEntity)

    @Delete
    fun delete(serie: SerieEntity)

    @Update
    fun updateSerie(serie: SerieEntity)

}