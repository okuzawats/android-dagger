package com.okuzawats.dagger

import android.app.Application
import com.okuzawats.dagger.di.DaggerAppComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.create()
    }
}