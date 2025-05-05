package com.example.dixmax_amv.features.movie.data.remote.firestore

import com.example.dixmax_amv.features.movie.domain.model.Award
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.tasks.await
import org.koin.core.annotation.Single

@Single
class FirestoreMovieRemoteDataSource(private val firestore: FirebaseFirestore) {

    private val moviesRef = firestore.collection("movies")
    private val awardsRef = firestore.collection("awards")

    // ---------- MOVIES ----------

    suspend fun saveMovie(movie: Movie) {
        val movieFs = movie.toEntityFs()
        moviesRef.document(movie.id).set(movieFs).await()
    }

    suspend fun getAllMovies(): List<Movie> {
        val movieDocs = moviesRef.get().await()
        val moviesFs = movieDocs.toObjects(MovieFsEntity::class.java)

        // Obtener todos los awards necesarios
        val awardIds = moviesFs.map { it.award }.toSet()
        val awardMap = getAwardsByIds(awardIds)

        return moviesFs.mapNotNull { movieFs ->
            awardMap[movieFs.award]?.let { movieFs.toDomain(it) }
        }
    }

    suspend fun getMovieById(id: String): Movie? {
        val movieSnap = moviesRef.document(id).get().await()
        val movieFs = movieSnap.toObject(MovieFsEntity::class.java) ?: return null
        val awardSnap = awardsRef.document(movieFs.award).get().await()
        val award = awardSnap.toObject(AwardFsEntity::class.java)?.toDomain() ?: return null
        return movieFs.toDomain(award)
    }

    suspend fun deleteMovie(movie: Movie) {
        moviesRef.document().delete().await()
    }

    suspend fun updateMovie(movie: Movie) {
        saveMovie(movie) // Reutiliza save con el mismo ID
    }

    // ---------- AWARDS ----------

    private suspend fun saveAward(award: Award) {
        val awardFs = award.toEntityFs()
        awardsRef.document(award.id).set(awardFs).await()
    }

    suspend fun getAllAwards(): List<Award> {
        val awardDocs = awardsRef.get().await()
        return awardDocs.toObjects(AwardFsEntity::class.java).map { it.toDomain() }
    }

    suspend fun getAwardById(id: String): Award? {
        val snap = awardsRef.document(id).get().await()
        return snap.toObject(AwardFsEntity::class.java)?.toDomain()
    }

    suspend fun deleteAward(id: String) {
        awardsRef.document(id).delete().await()
    }

    suspend fun updateAward(award: Award) {
        saveAward(award)
    }

    // ---------- UTILS ----------

    private suspend fun getAwardsByIds(ids: Set<String>): Map<String, Award> {
        if (ids.isEmpty()) return emptyMap()
        val snapshots = ids.map { awardsRef.document(it).get().await() }
        return snapshots.mapNotNull { snap ->
            val award = snap.toObject(AwardFsEntity::class.java)?.toDomain()
            if (award != null) snap.id to award else null
        }.toMap()
    }

    suspend fun saveMovies(movies: List<Movie>) {
        val batch = firestore.batch()
        movies.forEach { movie ->
            val movieFs = movie.toEntityFs()
            val docRef = moviesRef.document(movie.id)
            batch.set(docRef, movieFs)
        }
        batch.commit().await()
    }

    suspend fun saveAwards(awards: List<Award>) {
        val batch = firestore.batch()
        awards.forEach { award ->
            val awardFs = award.toEntityFs()
            val docRef = awardsRef.document(award.id)
            batch.set(docRef, awardFs)
        }
        batch.commit().await()
    }

}

