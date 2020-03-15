package com.okuzawats.dagger.di

import dagger.Component

@AppScope
@Component(modules = [
    LuckyNumberModule::class,
    FortuneModule::class
])
interface AppComponent {
    @NamedLuckyNumberText
    fun getLuckyNumberText(): String

    @NamedFortuneText
    fun getFortuneText(): String
}