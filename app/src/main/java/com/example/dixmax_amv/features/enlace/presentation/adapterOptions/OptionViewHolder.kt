package com.example.dixmax_amv.features.enlace.presentation.adapterOptions

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dixmax_amv.databinding.ItemOptionBinding
import com.example.dixmax_amv.features.enlace.domain.Option

class OptionViewHolder(private val binding: ItemOptionBinding) : ViewHolder(binding.root) {

    fun bind(option: Option) {
        binding.apply {
            name.text = option.name
            quality.text = option.quality
        }
    }
}