package com.example.dixmax_amv.features.enlace.domain

import org.koin.core.annotation.Single

@Single
class GetLinkListUseCase(private val linkRepository: LinkRepository) {
    suspend operator fun invoke(): List<Link> {
        return linkRepository.getAll()
    }
}