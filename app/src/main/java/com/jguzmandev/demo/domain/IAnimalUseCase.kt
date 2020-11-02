package com.jguzmandev.demo.domain

import com.jguzmandev.demo.data.model.Animal
import com.jguzmandev.demo.utils.Resource

interface IAnimalUseCase {
    suspend fun fetchAnimals(): Resource<List<Animal>>
}