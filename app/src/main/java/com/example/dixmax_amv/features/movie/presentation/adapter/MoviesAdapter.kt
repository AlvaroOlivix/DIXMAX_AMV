package com.example.dixmax_amv.features.movie.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dixmax_amv.databinding.ItemMovieBinding
import com.example.dixmax_amv.features.movie.domain.model.Movie

class MoviesAdapter(private val onCLick:(Movie)->Unit) :
    ListAdapter<Movie, MoviesViewHolder>(MovieDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = ItemMovieBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie, onCLick)
    }
}