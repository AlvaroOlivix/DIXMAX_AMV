package com.example.dixmax_amv.core.di

import android.content.Context
import androidx.room.Room
import com.example.dixmax_amv.core.db.DixmaxDataBase

object DataBaseProvider {
    fun provideDB(context: Context): DixmaxDataBase {
        return Room.databaseBuilder(
            context,
            DixmaxDataBase::class.java, "db"
        ).build()
    }
}