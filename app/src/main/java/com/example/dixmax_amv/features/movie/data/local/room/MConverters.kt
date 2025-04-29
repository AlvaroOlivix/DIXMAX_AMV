package com.example.dixmax_amv.features.movie.data.local.room

import androidx.room.TypeConverter
import com.example.dixmax_amv.features.movie.domain.model.Award
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MConverters {
        private val gson = Gson()

        // Convierte un objeto Award a un String (JSON)
        @TypeConverter
        fun fromAward(award: Award): String {
            return gson.toJson(award)  // Convertir el Award a un JSON string
        }

        // Convierte un String (JSON) a un objeto Award
        @TypeConverter
        fun toAward(awardJson: String): Award {
            return gson.fromJson(
                awardJson,
                Award::class.java
            )  // Convertir el JSON string de vuelta al objeto Award
        }
    }