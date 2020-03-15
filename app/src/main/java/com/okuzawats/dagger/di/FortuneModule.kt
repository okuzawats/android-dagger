package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides

@Module
class FortuneModule {
    @AppScope
    @Provides
    @NamedFortuneText
    fun provideFortuneText(
        @NamedLuckyNumber luckyNumber: Int
    ): String {
        val fortune = when (luckyNumber) {
            in 0..99 -> "アゲアゲ！！！"
            in 100..499 -> "アゲ！！"
            in 500..899 -> "サゲ！"
            else -> "サゲサゲ"
        }
        return "今日の運勢： $fortune"
    }
}