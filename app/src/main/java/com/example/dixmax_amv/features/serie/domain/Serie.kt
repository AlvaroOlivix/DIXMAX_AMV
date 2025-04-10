package com.example.dixmax_amv.features.serie.domain

data class Serie(
    val id: String,
    val title: String,
    val categories: List<Category>,
    val released: String,
    val country: String,
    val rated: String,
    val seasons: String,
    val poster: String,
    val score: String,
    val bookMark:Boolean
)