package com.jguzmandev.demo.data.network

import com.jguzmandev.demo.data.model.Animal
import com.jguzmandev.demo.utils.Resource

interface IAnimalFirebaseRepo {
    suspend fun fetchAnimals():Resource<List<Animal>>
}