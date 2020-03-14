package com.okuzawats.dagger.di

import dagger.Component
import javax.inject.Named

@AppScope
@Component(modules = [
    LuckyNumberModule::class,
    FortuneModule::class
])
interface AppComponent {
    @Named("lucky number text")
    fun getLuckyNumberText(): String

    @Named("fortune text")
    fun getFortuneText(): String
}