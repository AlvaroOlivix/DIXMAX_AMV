package com.example.dixmax_amv.features.enlace.presentation.adapterOptions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.dixmax_amv.databinding.ItemOptionBinding
import com.example.dixmax_amv.features.enlace.domain.Option

class OptionsAdapter() :
    ListAdapter<Option, OptionViewHolder>(OptionDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OptionViewHolder {
        val binding = ItemOptionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OptionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OptionViewHolder, position: Int) {
        val option = getItem(position)
        holder.bind(option)
    }
}