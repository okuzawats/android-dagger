package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class LuckyNumberModule(
    private val luckyNumber: Int
) {
    @AppScope
    @Provides
    @Named("lucky number text")
    fun provideLuckyNumberText() = "今日のラッキーナンバー: $luckyNumber"
}