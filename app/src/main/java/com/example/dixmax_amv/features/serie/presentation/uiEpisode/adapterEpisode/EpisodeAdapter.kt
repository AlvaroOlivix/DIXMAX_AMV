package com.example.dixmax_amv.features.serie.presentation.uiEpisode.adapterEpisode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dixmax_amv.databinding.ItemEpisodeBinding
import com.example.dixmax_amv.features.serie.domain.Episode

class EpisodeAdapter() :
    ListAdapter<Episode, EpisodeViewHolder>(EpisodeDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val binding = ItemEpisodeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EpisodeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        val episode = getItem(position)
        holder.bind(episode)
    }
}