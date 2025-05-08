package com.example.dixmax_amv.features.movie.domain.model

data class Movie(
    val id: String,
    val title: String,
    val description: String,
    val poster: String,
    val award: Award,
    val isFavorite: Boolean
)
