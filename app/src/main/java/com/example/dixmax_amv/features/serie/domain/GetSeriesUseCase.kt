package com.example.dixmax_amv.features.serie.domain

import org.koin.core.annotation.Single

@Single
class GetSeriesUseCase(private val serieRepository: SerieRepository) {
    suspend operator fun invoke(): List<Serie> {
        return serieRepository.getSeries()
    }
}