package com.example.a16_13_daggerhilt

interface CurrencyRepository {
    fun getCurrencies(): List<Currency>
}