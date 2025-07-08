package com.dbarad.composebase.data.di

import com.dbarad.composebase.data.BaseRepository
import com.dbarad.composebase.data.BaseRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindBaseRepository(baseRepositoryImpl: BaseRepositoryImpl): BaseRepository
}