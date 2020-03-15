package com.okuzawats.dagger.di

import dagger.Component

@AppScope
@Component(modules = [
    LuckyNumberModule::class,
    FortuneModule::class
])
interface AppComponent {
    fun getLuckyNumberTextCreator(): LuckyNumberTextCreator

    @NamedFortuneText
    fun getFortuneText(): String
}