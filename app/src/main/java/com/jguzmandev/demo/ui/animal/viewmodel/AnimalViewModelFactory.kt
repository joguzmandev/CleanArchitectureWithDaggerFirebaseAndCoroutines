package com.jguzmandev.demo.ui.animal.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jguzmandev.demo.domain.IAnimalUseCase
import javax.inject.Inject

class AnimalViewModelFactory @Inject constructor(private val animalUserCase: IAnimalUseCase) :
    ViewModelProvider.Factory {

    companion object {
        fun newInstance(animalUserCase: IAnimalUseCase): AnimalViewModelFactory =
            AnimalViewModelFactory(animalUserCase)

    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AnimalViewModel(animalUserCase) as T
    }
}