package com.example.dixmax_amv.core.db

import androidx.room.TypeConverter
import com.example.dixmax_amv.features.serie.domain.Category
import com.example.dixmax_amv.features.serie.domain.Serie
import com.google.gson.Gson

class Converters {
    @TypeConverter
    fun fromListToData(categories: List<Category>): String {
        return Gson().toJson(categories)
    }

    @TypeConverter
    fun fromDataToList(data: String): List<Category> {
        return Gson().fromJson(data, Array<Category>::class.java).toList()
    }
}