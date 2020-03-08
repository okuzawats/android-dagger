package com.okuzawats.dagger

import android.app.Application
import android.util.Log
import com.okuzawats.dagger.di.AppComponent
import com.okuzawats.dagger.di.DaggerAppComponent
import com.okuzawats.dagger.di.LuckyNumberModule

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        val luckyNumberModule = LuckyNumberModule(777)

        appComponent = DaggerAppComponent.builder()
            .luckyNumberModule(luckyNumberModule)
            .build()

        val luckyNumber = appComponent.getLuckyNumberText()
        Log.i("App", luckyNumber)
    }
}