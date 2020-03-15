package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides

@Module
class LuckyNumberModule(
    private val luckyNumber: Int
) {
    @AppScope
    @Provides
    fun provideLuckyNumberTextCreator() = LuckyNumberTextCreator(luckyNumber)

    @AppScope
    @Provides
    fun provideLuckyNumber() = luckyNumber
}