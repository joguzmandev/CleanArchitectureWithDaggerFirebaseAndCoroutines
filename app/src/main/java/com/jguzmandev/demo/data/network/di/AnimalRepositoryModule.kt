package com.jguzmandev.demo.data.network.di

import com.jguzmandev.demo.data.network.AnimalFirebaseRepoImpl
import com.jguzmandev.demo.data.network.IAnimalFirebaseRepo
import dagger.Binds
import dagger.Module

@Module
abstract class AnimalRepositoryModule {

    @Binds
    abstract fun bindAnimalRepository(repository: AnimalFirebaseRepoImpl): IAnimalFirebaseRepo

}