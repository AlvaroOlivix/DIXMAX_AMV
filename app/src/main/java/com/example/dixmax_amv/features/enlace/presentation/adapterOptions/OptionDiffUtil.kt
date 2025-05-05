package com.example.dixmax_amv.features.enlace.presentation.adapterOptions

import androidx.recyclerview.widget.DiffUtil
import com.example.dixmax_amv.features.enlace.domain.Link
import com.example.dixmax_amv.features.enlace.domain.Option

class OptionDiffUtil : DiffUtil.ItemCallback<Option>() {
    override fun areItemsTheSame(oldItem: Option, newItem: Option): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Option, newItem: Option): Boolean {
        return oldItem == newItem
    }
}