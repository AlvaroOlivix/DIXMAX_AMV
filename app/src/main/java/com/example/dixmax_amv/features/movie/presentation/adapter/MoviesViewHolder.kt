package com.example.dixmax_amv.features.movie.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.dixmax_amv.core.extensions.loadImageUrl
import com.example.dixmax_amv.databinding.ItemMovieBinding
import com.example.dixmax_amv.features.movie.domain.model.Movie

class MoviesViewHolder(private val binding: ItemMovieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie, onCLick: (Movie) -> Unit) {
        binding.apply {
            poster.loadImageUrl(movie.poster)
            root.setOnClickListener { onCLick(movie) }
            awards.text = movie.award.name
        }
    }
}