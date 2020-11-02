package com.jguzmandev.demo.ui.animal

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.jguzmandev.demo.R
import com.jguzmandev.demo.base.BaseActivity
import com.jguzmandev.demo.ui.animal.viewmodel.AnimalViewModel
import com.jguzmandev.demo.ui.animal.viewmodel.AnimalViewModelFactory
import com.jguzmandev.demo.utils.Resource
import javax.inject.Inject

class AnimalActivity : BaseActivity() {

    private val TAG = "AnimalActivity.kt"

    @Inject
    lateinit var animalViewModelFactory:AnimalViewModelFactory

    private val animalViewModel by viewModels<AnimalViewModel> { animalViewModelFactory }


    override fun getViewId(): Int = R.layout.activity_animal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.daggerActivity.inject(this)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: BEFORE")
        animalViewModel.fetchAnimals.observe(this, Observer { resource ->
            when (resource) {
                is Resource.Loading -> {
                    Log.d(TAG, "onStart: Loading")
                }
                is Resource.Success -> {
                    Log.d(TAG, "onStart: Success")
                    for (item in resource.data) {
                        Log.d(TAG, "Success: ${item.toString()}")
                    }
                }
                is Resource.Failure -> {
                    Log.d(TAG, "Failure: ${resource.ex.message!!}")
                }
            }
        })
        Log.d(TAG, "onStart: AFTER")
    }
}