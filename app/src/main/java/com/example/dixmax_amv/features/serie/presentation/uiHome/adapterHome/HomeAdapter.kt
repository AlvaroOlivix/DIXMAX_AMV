package com.example.dixmax_amv.features.serie.presentation.uiHome.adapterHome

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dixmax_amv.databinding.FragmentHomeBinding
import com.example.dixmax_amv.features.serie.domain.Serie

class HomeAdapter() : ListAdapter<Serie, HomeViewHolder>(HomeDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding =
            FragmentHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val serie = getItem(position)
        holder.bind(serie)
    }
}