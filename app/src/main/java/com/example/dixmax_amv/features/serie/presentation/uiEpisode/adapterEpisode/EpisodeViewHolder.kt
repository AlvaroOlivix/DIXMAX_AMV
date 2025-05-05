package com.example.dixmax_amv.features.serie.presentation.uiEpisode.adapterEpisode

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dixmax_amv.databinding.ItemEpisodeBinding
import com.example.dixmax_amv.features.serie.domain.Episode

class EpisodeViewHolder(private val binding: ItemEpisodeBinding) : ViewHolder(binding.root) {

    fun bind(episode: Episode) {
        binding.apply {
            name.text = episode.name
            date.text = episode.date
            description.text = episode.description
        }
    }
}