package com.okuzawats.dagger

import android.app.Application
import android.util.Log
import com.okuzawats.dagger.di.AppComponent
import com.okuzawats.dagger.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
        val luckyNumber = appComponent.getLuckyNumberText()
        Log.i("App", luckyNumber)
    }
}