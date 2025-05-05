package com.example.dixmax_amv.features.enlace.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dixmax_amv.features.enlace.domain.Option

const val LINK_TABLE = "LInkTable"

@Entity(tableName = LINK_TABLE)
data class LinkEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "ticket") val ticket: String,
    @ColumnInfo(name = "options") val options: List<Option>
)