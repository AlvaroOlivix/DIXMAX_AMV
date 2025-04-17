package com.example.dixmax_amv.features.serie.presentation.adater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dixmax_amv.databinding.ItemSerieBinding
import com.example.dixmax_amv.features.serie.domain.Serie

class SerieAdapter(
    private val bookMarkClick: (Serie) -> Unit,
    private val oClick: (Serie) -> Unit
) : ListAdapter<Serie, SerieViewHolder>(SerieDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SerieViewHolder {
        val binding = ItemSerieBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return SerieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SerieViewHolder, position: Int) {
        val serie = getItem(position)
        holder.bind(serie, bookMarkClick, oClick)
    }
}