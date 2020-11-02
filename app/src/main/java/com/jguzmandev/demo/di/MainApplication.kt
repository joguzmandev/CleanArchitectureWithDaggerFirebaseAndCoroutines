package com.jguzmandev.demo.di

import android.app.Application

class MainApplication  : Application(){

    private lateinit var mainComponent: MainComponent

    override fun onCreate() {
        super.onCreate()
        mainComponent = DaggerMainComponent.builder()
            .mainModule(MainModule(this))
            .build()
    }

    fun getComponent() = mainComponent
}