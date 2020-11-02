package com.jguzmandev.demo.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.jguzmandev.demo.di.MainApplication

abstract class BaseActivity : AppCompatActivity() {

    @LayoutRes abstract fun getViewId():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getViewId())
    }

    protected val daggerActivity by lazy {
        (application as MainApplication).getComponent()
    }
}