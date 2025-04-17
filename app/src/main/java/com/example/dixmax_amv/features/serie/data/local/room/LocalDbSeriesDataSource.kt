package com.example.dixmax_amv.features.serie.data.local.room

import com.example.dixmax_amv.features.serie.domain.Serie
import org.koin.core.annotation.Single

@Single
class LocalDbSeriesDataSource(private val serieDao: SerieDao) {
    fun getSeries(): List<Serie> {
        return serieDao.getAll().map { it.toModel() }
    }

    fun getSerieById(serieId: String): Serie? {
        return serieDao.getById(serieId)?.toModel()
    }

    fun saveSeries(series: List<Serie>) {
        serieDao.saveSeries(*series.map { it.toEntity() }.toTypedArray())
    }

    fun saveSerie(serie: Serie) {
        serieDao.saveSerie(serie.toEntity())
    }

    fun deleteSerie(serie: Serie) {
        serieDao.delete(serie.toEntity())
    }

    fun editSerie(serie: Serie) {
        serieDao.updateSerie(serie.toEntity())
    }

}