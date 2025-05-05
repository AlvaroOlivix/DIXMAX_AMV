package com.example.dixmax_amv.features.serie.domain

import android.util.Log
import org.koin.core.annotation.Single

@Single
class GetSeriesUseCase(private val serieRepository: SerieRepository) {
    suspend operator fun invoke(): List<Serie> {
        val all = serieRepository.getSeries()
        Log.d("@dev", "Series en repositorio: ${all.size}")
        return all
    }
}
