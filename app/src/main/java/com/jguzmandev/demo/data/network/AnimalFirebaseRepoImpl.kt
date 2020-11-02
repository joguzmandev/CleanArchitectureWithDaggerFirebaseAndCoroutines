package com.jguzmandev.demo.data.network

import com.google.firebase.firestore.FirebaseFirestore
import com.jguzmandev.demo.data.model.Animal
import com.jguzmandev.demo.utils.FirebaseKeyCollection
import com.jguzmandev.demo.utils.Resource
import com.jguzmandev.demo.utils.toList
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AnimalFirebaseRepoImpl @Inject constructor(private val firebaseFireStore: FirebaseFirestore) : IAnimalFirebaseRepo {


    override suspend fun fetchAnimals(): Resource<List<Animal>> {
        val animalsQuery = firebaseFireStore.collection(FirebaseKeyCollection.animalKeyCollection)
            .get().await()
        val result = animalsQuery.documents.toList(Animal::class.java)
        return Resource.Success(result)
    }
}