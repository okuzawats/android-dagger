package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides

@Module
class LuckyNumberModule(
    private val luckyNumber: Int
) {
    @AppScope
    @Provides
    @NamedLuckyNumberText
    fun provideLuckyNumberText() = "今日のラッキーナンバー: $luckyNumber"

    @AppScope
    @Provides
    @NamedLuckyNumber
    fun provideLuckyNumber() = luckyNumber
}