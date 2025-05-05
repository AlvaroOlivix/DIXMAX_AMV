package com.example.dixmax_amv.features.movie.data.remote.firestore

import com.example.dixmax_amv.features.movie.domain.model.Award
import com.google.firebase.firestore.PropertyName

data class MovieFsEntity(
    @get:PropertyName("id") @set:PropertyName("id") var id: String = "",
    @get:PropertyName("title") @set:PropertyName("title") var title: String = "",
    @get:PropertyName("description") @set:PropertyName("description") var description: String = "",
    @get:PropertyName("poster") @set:PropertyName("poster") var poster: String = "",
    @get:PropertyName("award") @set:PropertyName("award") var award: String = ""
)
