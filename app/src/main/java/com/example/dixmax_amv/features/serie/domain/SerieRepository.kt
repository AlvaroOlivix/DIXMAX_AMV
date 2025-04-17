package com.example.dixmax_amv.features.serie.domain

interface SerieRepository {
    fun getSeries(): List<Serie>
    suspend fun getSerieById(serieId: String): Serie?
    fun saveSeries(series: List<Serie>)
    fun saveSerie(serie: Serie)
    fun deleteSerie(serie: Serie)
    fun editSerie(serie: Serie)
}