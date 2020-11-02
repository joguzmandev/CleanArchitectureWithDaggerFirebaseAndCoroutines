package com.jguzmandev.demo.di

import android.app.Application
import android.content.Context
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides


@Module
class MainModule constructor(private val context:Application) {

    @Provides
    fun provideContext(): Context = context.baseContext

    @Provides
    fun provideFirebase(): FirebaseFirestore = Firebase.firestore
}