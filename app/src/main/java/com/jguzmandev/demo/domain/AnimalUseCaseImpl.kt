package com.jguzmandev.demo.domain

import com.jguzmandev.demo.data.model.Animal
import com.jguzmandev.demo.data.network.IAnimalFirebaseRepo
import com.jguzmandev.demo.utils.Resource
import javax.inject.Inject

class AnimalUseCaseImpl @Inject constructor(private val animalRepository: IAnimalFirebaseRepo) :
    IAnimalUseCase {

    override suspend fun fetchAnimals(): Resource<List<Animal>>
            = animalRepository.fetchAnimals()
}