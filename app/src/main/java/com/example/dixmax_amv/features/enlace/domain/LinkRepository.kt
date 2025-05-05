package com.example.dixmax_amv.features.enlace.domain

interface LinkRepository {
    suspend fun getAll(): List<Link>
    suspend fun getEnlaceById(linkId: String): Link?
    suspend fun saveEnlace(link: Link)
    suspend fun saveEnlacesList(links: List<Link>)
    suspend fun deleteEnlace(link: Link)
}