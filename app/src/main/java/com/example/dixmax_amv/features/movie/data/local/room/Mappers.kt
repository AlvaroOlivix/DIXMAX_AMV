package com.example.dixmax_amv.features.movie.data.local.room

import com.example.dixmax_amv.features.movie.domain.model.Movie

fun Movie.toEntity() =
    MovieEntity(
        this.id,
        this.title,
        this.description,
        this.poster,
        this.award,
        this.isFavorite
    )

fun MovieEntity.toModel() = Movie(
    this.id,
    this.title,
    this.description,
    this.poster,
    this.award,
    this.isFavorite
)