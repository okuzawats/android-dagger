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

        val luckyNumber = 777
        val luckyNumberModule = LuckyNumberModule(luckyNumber)

        appComponent = DaggerAppComponent.builder()
            .luckyNumberModule(luckyNumberModule)
            .build()

        Log.i("App", appComponent.getLuckyNumberTextCreator().luckyNumberText())
        Log.i("App", appComponent.getFortuneText())
    }
}