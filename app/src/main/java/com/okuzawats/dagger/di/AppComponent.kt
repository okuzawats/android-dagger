package com.okuzawats.dagger.di

import dagger.Component

@AppScope
@Component(modules = [
    LuckyNumberModule::class
])
interface AppComponent {
    fun getLuckyNumberTextCreator(): LuckyNumberTextCreator
    fun getFortuneTextCreator(): FortuneTextCreator
}