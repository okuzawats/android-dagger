package com.okuzawats.dagger.di

import javax.inject.Inject

@AppScope
class LuckyNumberTextCreator @Inject constructor(
    private val luckyNumber: Int
) {
    fun luckyNumberText() = "今日のラッキーナンバー: $luckyNumber"
}