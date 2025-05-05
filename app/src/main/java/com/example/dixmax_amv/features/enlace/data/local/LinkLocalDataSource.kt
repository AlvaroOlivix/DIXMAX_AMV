package com.example.dixmax_amv.features.enlace.data.local

import com.example.dixmax_amv.features.enlace.domain.Link
import org.koin.core.annotation.Single

@Single
class LinkLocalDataSource(private val linkDao: LinkDao) {

    suspend fun saveAll(vararg links: Link) {
        linkDao.saveAll(*links.map { it.toEntity() }.toTypedArray())
    }

    suspend fun saveLink(link: Link) {
        linkDao.saveLink(link.toEntity())
    }

    suspend fun getLinkById(linkId: String): Link? {
        return linkDao.getLinkById(linkId)?.toDomain()
    }

    suspend fun getAll(): List<Link> {
        return linkDao.getAll().map { it.toDomain() }
    }

    suspend fun delete(link: Link) {
        linkDao.delete(link.toEntity())
    }
}