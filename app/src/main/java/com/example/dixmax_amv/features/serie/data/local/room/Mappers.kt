package com.example.dixmax_amv.features.serie.data.local.room

import android.util.Log
import com.example.dixmax_amv.features.serie.domain.Serie


fun SerieEntity.toModel(): Serie {
    Log.d("Mapper", "Converting SerieEntity to Serie: $this")
    return Serie(
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
}

fun Serie.toEntity(): SerieEntity {
    Log.d("Mapper", "Converting Serie to SerieEntity: $this")
    return SerieEntity(
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
}
