package com.example.dixmax_amv.features.movie.data.remote.firestore

import com.example.dixmax_amv.features.movie.domain.model.Award
import com.example.dixmax_amv.features.movie.domain.model.Movie

// MovieFsEntity a Movie (requiere el Award correspondiente)
fun MovieFsEntity.toDomain(award: Award): Movie = Movie(
    id = id,
    title = title,
    description = description,
    poster = poster,
    award = award
)

// Movie a MovieFsEntity (solo guarda el ID del award)
fun Movie.toEntityFs(): MovieFsEntity = MovieFsEntity(
    id = id,
    title = title,
    description = description,
    poster = poster,
    award = award.id
)

// AwardFsEntity a Award
fun AwardFsEntity.toDomain(): Award = Award(
    id = id,
    name = name,
    year = year
)

// Award a AwardFsEntity
fun Award.toEntityFs(): AwardFsEntity = AwardFsEntity(
    id = id,
    name = name,
    year = year
)

