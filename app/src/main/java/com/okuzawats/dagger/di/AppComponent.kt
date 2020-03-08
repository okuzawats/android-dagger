package com.okuzawats.dagger.di

import dagger.Component
import javax.inject.Named

@AppScope
@Component(modules = [LuckyNumberModule::class])
interface AppComponent {
    @Named("lucky number text")
    fun getLuckyNumberText(): String
}