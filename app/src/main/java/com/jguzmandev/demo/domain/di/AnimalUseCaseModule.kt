package com.jguzmandev.demo.domain.di

import com.jguzmandev.demo.domain.AnimalUseCaseImpl
import com.jguzmandev.demo.domain.IAnimalUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AnimalUseCaseModule {

    @Binds
   abstract fun bindAnimalUseCase(useCase:AnimalUseCaseImpl): IAnimalUseCase
}