package com.example.dixmax_amv.features.serie.data.remote.firestore

import com.example.dixmax_amv.features.serie.domain.Serie
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class SerieFirestoreRemoteDataSource {
    private val firestore = FirebaseFirestore.getInstance()
    private val seriesCollection = firestore.collection("series")

    suspend fun getAllSeries(): List<Serie> = withContext(Dispatchers.IO) {
        val snapshot = seriesCollection.get().await()
        snapshot.documents.mapNotNull { it.toObject(Serie::class.java) }
    }

    suspend fun getSerieById(id: String): Serie? = withContext(Dispatchers.IO) {
        val doc = seriesCollection.document(id).get().await()
        doc.toObject(Serie::class.java)
    }

    private fun saveSerie(serie: Serie) {
        seriesCollection.document(serie.id).set(serie)
    }

    fun saveSeries(series: List<Serie>) {
        series.forEach { saveSerie(it) }
    }

    fun deleteSerie(serie: Serie) {
        seriesCollection.document(serie.id).delete()
    }

    fun editSerie(serie: Serie) {
        saveSerie(serie) // Sobreescribe el documento
    }
}