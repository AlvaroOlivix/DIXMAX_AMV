package com.example.dixmax_amv.features.serie.domain

data class Serie(
    val id: String,
    val title: String,
    val released: String,
    val country: String,
    val rated: String,
    val seasons: List<Season>,
    val poster: String,
    val score: String,
    val bookMark:Boolean
)