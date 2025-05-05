package com.example.dixmax_amv.features.movie.data.remote.firestore

import com.google.firebase.firestore.PropertyName

data class AwardFsEntity(
    @get:PropertyName("id") @set:PropertyName("id") var id: String = "",
    @get:PropertyName("name") @set:PropertyName("name") var name: String = "",
    @get:PropertyName("year") @set:PropertyName("year") var year: String = ""
)