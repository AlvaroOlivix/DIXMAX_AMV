package com.example.dixmax_amv.features.enlace.data

import com.example.dixmax_amv.features.enlace.data.local.LinkLocalDataSource
import com.example.dixmax_amv.features.enlace.data.remote.LinkRemoteMockDataSource
import com.example.dixmax_amv.features.enlace.domain.Link
import com.example.dixmax_amv.features.enlace.domain.LinkRepository
import org.koin.core.annotation.Single

@Single
class LinkDataRepository(
    private val localData: LinkLocalDataSource,
    private val remoteData: LinkRemoteMockDataSource
) : LinkRepository {
    override suspend fun getAll(): List<Link> {
        return remoteData.getAllLinks()
    }

    override suspend fun getEnlaceById(linkId: String): Link? {
        return remoteData.getLikById(linkId)
    }

    override suspend fun saveEnlace(link: Link) {
        localData.saveLink(link)
    }

    override suspend fun saveEnlacesList(links: List<Link>) {
        localData.saveAll()
    }

    override suspend fun deleteEnlace(link: Link) {
        localData.delete(link)
    }

}