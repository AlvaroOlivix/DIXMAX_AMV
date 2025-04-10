package com.example.dixmax_amv.core.extensions

import android.widget.ImageView
import coil.load
import com.example.dixmax_amv.R

fun ImageView.loadImageUrl(url:String?){
    this.load(url){
        crossfade(true)
        crossfade(500)
        error(R.drawable.arc)
    }

}