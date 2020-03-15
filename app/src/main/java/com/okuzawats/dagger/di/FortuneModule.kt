package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides

@Module
class FortuneModule {
    @AppScope
    @Provides
    fun provideFortuneTextCreator(luckyNumber: Int) = FortuneTextCreator(luckyNumber)
}