package com.example.dixmax_amv.core.di

import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore


object FireStoreProvider {
    fun provideFirestore(): FirebaseFirestore {
        return Firebase.firestore
    }
}
