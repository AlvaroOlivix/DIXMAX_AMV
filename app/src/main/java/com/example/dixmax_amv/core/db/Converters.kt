package com.example.dixmax_amv.core.db

import androidx.room.TypeConverter
import com.example.dixmax_amv.features.serie.domain.Season
import com.google.gson.Gson

class Converters {
    @TypeConverter
    fun fromSeasonsToData(seasons: List<Season>): String {
        return Gson().toJson(seasons)
    }

    @TypeConverter
    fun toSeasonList(data: String): List<Season> {
        return Gson().fromJson(data, Array<Season>::class.java).toList()
    }
}
