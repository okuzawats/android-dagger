package com.okuzawats.dagger.di

class LuckyNumberTextCreator(
    private val luckyNumber: Int
) {
    fun luckyNumberText() = "今日のラッキーナンバー: $luckyNumber"
}