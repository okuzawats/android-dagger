package com.okuzawats.dagger.di

import dagger.Component
import javax.inject.Named

@Component(modules = [LuckyNumberModule::class])
interface AppComponent {
    @Named("lucky number text")
    fun getLuckyNumberText(): String
}