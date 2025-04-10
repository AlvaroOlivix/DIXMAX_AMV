package com.example.dixmax_amv.features.serie.data.local.room

import com.example.dixmax_amv.features.serie.domain.Serie

fun Serie.toEntity(): SerieEntity = SerieEntity(
    this.id,
    this.title,
    this.categories,
    this.released,
    this.country,
    this.rated,
    this.seasons,
    this.poster,
    this.score, this.bookMark
)

fun SerieEntity.toModel(): Serie = Serie(
    this.id,
    this.title,
    this.categories,
    this.released,
    this.country,
    this.rated,
    this.seasons,
    this.poster,
    this.score,
    this.bookMark
)
