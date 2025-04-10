package com.example.dixmax_amv.features.serie.domain

import org.koin.core.annotation.Single

@Single
class GetSerieUseCase(private val serieRepository: SerieRepository) {

    suspend operator fun invoke(serieId: String): Serie? {
        return serieRepository.getSerieById(serieId)
    }
}