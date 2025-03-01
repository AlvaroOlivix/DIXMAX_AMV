package com.example.dixmax_amv.features.serie.domain

interface SerieRepository {
    fun getSeries(): List<Serie>?
    fun getSerieById(serieId: String): Serie?
}