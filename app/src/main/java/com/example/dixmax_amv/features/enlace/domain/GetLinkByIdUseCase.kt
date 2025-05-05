package com.example.dixmax_amv.features.enlace.domain

import org.koin.core.annotation.Single

@Single
class GetLinkByIdUseCase(private val linkRepository: LinkRepository) {
    suspend operator fun invoke(linkId: String): Link? {
        return linkRepository.getEnlaceById(linkId)
    }
}