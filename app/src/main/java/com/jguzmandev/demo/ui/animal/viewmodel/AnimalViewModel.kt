package com.jguzmandev.demo.ui.animal.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.jguzmandev.demo.domain.IAnimalUseCase
import com.jguzmandev.demo.utils.Resource
import kotlinx.coroutines.Dispatchers

class AnimalViewModel constructor(private val animalUserCase: IAnimalUseCase) : ViewModel() {

    val fetchAnimals = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try{
            val animalsList = animalUserCase.fetchAnimals()
            emit(animalsList)
        }catch(ex:Exception){
            emit(Resource.Failure(ex))
        }
    }
}