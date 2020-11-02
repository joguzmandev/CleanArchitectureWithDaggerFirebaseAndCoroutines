package com.jguzmandev.demo.di

import com.jguzmandev.demo.data.network.di.AnimalRepositoryModule
import com.jguzmandev.demo.domain.di.AnimalUseCaseModule
import com.jguzmandev.demo.ui.animal.AnimalActivity
import dagger.Component

@Component(modules = [
    MainModule::class,
    AnimalRepositoryModule::class,
    AnimalUseCaseModule::class
])
interface MainComponent {

    fun inject(animalActivity: AnimalActivity)
}