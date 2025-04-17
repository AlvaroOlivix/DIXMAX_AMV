package com.example.dixmax_amv.features.serie.presentation.adater

import androidx.recyclerview.widget.RecyclerView
import com.example.dixmax_amv.R
import com.example.dixmax_amv.core.extensions.loadImageUrl
import com.example.dixmax_amv.databinding.ItemSerieBinding
import com.example.dixmax_amv.features.serie.domain.Serie

class SerieViewHolder(private val binding: ItemSerieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(serie: Serie, bookMarkClick: (Serie) -> Unit, oClick: (Serie) -> Unit) {
        binding.apply {
            score.text = serie.score
            rated.text = serie.rated
            year.text = serie.released
            poster.loadImageUrl(serie.poster)
            bookmarkAction.setOnClickListener { bookMarkClick(serie) }
            root.setOnClickListener { oClick(serie) }
            bookmarkAction.setImageResource(
                if (serie.bookMark) {
                    R.drawable.baseline_bookmark_24
                } else R.drawable.outline_bookmark_border_24
            )
        }
    }
}