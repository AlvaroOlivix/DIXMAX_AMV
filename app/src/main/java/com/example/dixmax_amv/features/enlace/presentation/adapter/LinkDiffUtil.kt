package com.example.dixmax_amv.features.enlace.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.dixmax_amv.features.enlace.domain.Link

class LinkDiffUtil : DiffUtil.ItemCallback<Link>() {

    override fun areItemsTheSame(oldItem: Link, newItem: Link): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Link, newItem: Link): Boolean {
        return oldItem == newItem
    }
}