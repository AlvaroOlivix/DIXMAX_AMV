package com.example.dixmax_amv.features.enlace.presentation.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dixmax_amv.databinding.ItemLinkBinding
import com.example.dixmax_amv.features.enlace.domain.Link

class LinksViewHolder(private val binding: ItemLinkBinding) : ViewHolder(binding.root) {

    fun bind(link: Link, onCLick: (Link) -> Unit) {
        binding.apply {
            name.text = link.name
            ticket.text = link.ticket
            root.setOnClickListener { onCLick(link) }
        }
    }
}