package com.example.dixmax_amv.features.serie.data

import com.example.dixmax_amv.features.serie.data.local.room.LocalDbSeriesDataSource
import com.example.dixmax_amv.features.serie.data.remote.MockSeriesRemoteDataSource
import com.example.dixmax_amv.features.serie.domain.Serie
import com.example.dixmax_amv.features.serie.domain.SerieRepository
import org.koin.core.annotation.Single

@Single
class SeriesDataRepository(
    private val localDbSeriesDataSource: LocalDbSeriesDataSource,
    private val remoteDataSource: MockSeriesRemoteDataSource
) : SerieRepository {
    override fun getSeries(): List<Serie> {
        val localSeries = localDbSeriesDataSource.getSeries()
        if (localSeries.isEmpty()) {
            val remoteSeries = remoteDataSource.getSeries()
            localDbSeriesDataSource.saveSeries(remoteSeries)
            return remoteSeries
        }
        return localSeries
    }

    override suspend fun getSerieById(serieId: String): Serie? {
        val localSerie = localDbSeriesDataSource.getSerieById(serieId)
        return localSerie
    }

    override fun saveSeries(series: List<Serie>) {
        localDbSeriesDataSource.saveSeries(series)
    }

    override fun saveSerie(serie: Serie) {
        localDbSeriesDataSource.saveSerie(serie)
    }

    override fun deleteSerie(serie: Serie) {
        localDbSeriesDataSource.deleteSerie(serie)
    }

    override fun editSerie(serie: Serie) {
        localDbSeriesDataSource.editSerie(serie)
    }
}