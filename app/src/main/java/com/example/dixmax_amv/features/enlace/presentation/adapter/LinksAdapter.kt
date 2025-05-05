package com.example.dixmax_amv.features.enlace.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dixmax_amv.databinding.ItemLinkBinding
import com.example.dixmax_amv.features.enlace.domain.Link

class LinksAdapter(private val onCLick: (Link) -> Unit) :
    ListAdapter<Link, LinksViewHolder>(LinkDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinksViewHolder {
        val binding =
            ItemLinkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LinksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LinksViewHolder, position: Int) {
        val link = getItem(position)
        holder.bind(link, onCLick)
    }
}