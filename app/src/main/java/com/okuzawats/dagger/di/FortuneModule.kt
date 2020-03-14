package com.okuzawats.dagger.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class FortuneModule(private val luckyNumber: Int) {
    @AppScope
    @Provides
    @Named("fortune text")
    fun provideFortuneText(): String {
        val fortune = when (luckyNumber) {
            in 0..99 -> "アゲアゲ！！！"
            in 100..499 -> "アゲ！！"
            in 500..899 -> "サゲ！"
            else -> "サゲサゲ"
        }
        return "今日の運勢： $fortune"
    }
}