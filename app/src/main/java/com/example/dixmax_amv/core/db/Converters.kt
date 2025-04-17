package com.example.dixmax_amv.core.db

import androidx.room.TypeConverter
import com.example.dixmax_amv.features.serie.domain.Category
import com.google.gson.Gson

class Converters {
    @TypeConverter
    fun fromCategoryList(categories: List<Category>): String {
        return Gson().toJson(categories)
    }

    @TypeConverter
    fun toCategoryList(data: String): List<Category> {
        return Gson().fromJson(data, Array<Category>::class.java).toList()
    }
}
