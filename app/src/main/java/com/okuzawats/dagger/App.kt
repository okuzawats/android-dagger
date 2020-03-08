package com.okuzawats.dagger

import android.app.Application
import android.util.Log
import com.okuzawats.dagger.di.DaggerAppComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.create()
        val luckyNumber = appComponent.getLuckyNumberText()
        Log.i("App", luckyNumber)
    }
}