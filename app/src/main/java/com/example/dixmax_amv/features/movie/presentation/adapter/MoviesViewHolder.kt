package com.example.dixmax_amv.features.movie.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.dixmax_amv.R
import com.example.dixmax_amv.core.extensions.loadImageUrl
import com.example.dixmax_amv.databinding.ItemMovieBinding
import com.example.dixmax_amv.features.movie.domain.model.Movie

class MoviesViewHolder(private val binding: ItemMovieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie, onCLick: (Movie) -> Unit, onClickFavorite: (Movie) -> Unit) {
        binding.apply {
            poster.loadImageUrl(movie.poster)
            root.setOnClickListener { onCLick(movie) }
            favoriteAction.setOnClickListener { onClickFavorite(movie) }
            awards.text = movie.award.name

            favoriteAction.setImageResource(
                if (movie.isFavorite) {
                    R.drawable.baseline_favorite_24
                } else R.drawable.baseline_favorite_border_24
            )

        }
    }
}