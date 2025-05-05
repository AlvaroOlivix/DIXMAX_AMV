package com.example.dixmax_amv.features.serie.presentation.uiEpisode.adapterEpisode

import androidx.recyclerview.widget.DiffUtil
import com.example.dixmax_amv.features.serie.domain.Episode

class EpisodeDiffUtil :DiffUtil.ItemCallback<Episode>(){
    override fun areItemsTheSame(oldItem: Episode, newItem: Episode): Boolean {
        return oldItem.id ==newItem.id
    }

    override fun areContentsTheSame(oldItem: Episode, newItem: Episode): Boolean {
       return oldItem == newItem
    }
}