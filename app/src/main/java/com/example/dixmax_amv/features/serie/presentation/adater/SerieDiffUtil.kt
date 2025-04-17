package com.example.dixmax_amv.features.serie.presentation.adater

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.example.dixmax_amv.features.serie.domain.Serie

class SerieDiffUtil(): DiffUtil.ItemCallback<Serie>() {
    override fun areItemsTheSame(oldItem: Serie, newItem: Serie): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Serie, newItem: Serie): Boolean {
        return oldItem == newItem
    }
}