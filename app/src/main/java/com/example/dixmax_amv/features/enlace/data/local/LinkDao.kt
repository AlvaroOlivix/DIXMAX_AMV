package com.example.dixmax_amv.features.enlace.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LinkDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAll(vararg links: LinkEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveLink(link: LinkEntity)

    @Query("SELECT * FROM linktable WHERE id = :linkId")
    fun getLinkById(linkId: String): LinkEntity?

    @Query("SELECT * FROM linktable")
    fun getAll(): List<LinkEntity>

    @Delete
    fun delete(link: LinkEntity)


}