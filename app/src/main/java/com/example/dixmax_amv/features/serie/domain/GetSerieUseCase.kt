package com.example.dixmax_amv.features.serie.domain

import android.util.Log
import org.koin.core.annotation.Single

@Single
class GetSerieUseCase(private val serieRepository: SerieRepository) {

    suspend operator fun invoke(serieId: String): Serie? {
        Log.d("@dev", "Buscando serie con id en caso de uso: $serieId")
        val serie = serieRepository.getSerieById(serieId)
        Log.d("@dev", "Serie encontrada en caso  : $serie")
        return serie
    }
}