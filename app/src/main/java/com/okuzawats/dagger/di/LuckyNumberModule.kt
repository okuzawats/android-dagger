package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides
import javax.inject.Named
import kotlin.random.Random

@Module
class LuckyNumberModule {
    @Provides
    @Named("lucky number text")
    fun provideLuckyNumberText() = "今日のラッキーナンバー: ${Random.nextInt(1, 1000)}"
}