package com.example.dixmax_amv.features.enlace.data.local

import androidx.room.TypeConverter
import com.example.dixmax_amv.features.enlace.domain.Option
import com.google.gson.Gson

class LConverters {

    @TypeConverter
    fun fromOptionListToData(options: List<Option>): String {
        return Gson().toJson(options)
    }

    @TypeConverter
    fun toOptionList(data: String): List<Option> {
        return Gson().fromJson(data, Array<Option>::class.java).toList()
    }
}