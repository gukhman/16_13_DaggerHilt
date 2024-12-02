package com.example.a16_13_daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

class CurrenciesDI {
    @Module
    @InstallIn(SingletonComponent::class)
    object AppModule {

        @Provides
        @Singleton
        fun provideCurrencyRepository(): CurrencyRepository {
            return CurrencyRepositoryImpl()
        }
    }
}