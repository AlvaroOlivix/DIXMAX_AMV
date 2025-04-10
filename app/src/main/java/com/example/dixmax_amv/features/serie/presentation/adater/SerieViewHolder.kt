package com.example.dixmax_amv.features.serie.presentation.adater

import androidx.recyclerview.widget.RecyclerView
import com.example.dixmax_amv.core.extensions.loadImageUrl
import com.example.dixmax_amv.databinding.ItemSerieBinding
import com.example.dixmax_amv.features.serie.domain.Serie

class SerieViewHolder(private val binding: ItemSerieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(serie: Serie, bookMarkClick: (Serie) -> Unit) {
        binding.apply {
            score.text = serie.score
            rated.text = serie.rated
            year.text = serie.released
            poster.loadImageUrl(serie.poster)
            root.setOnClickListener { bookMarkClick(serie) }
        }
    }
}