package com.example.poketest.di

import com.example.poketest.data.remote.NetWorkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkClient {

    @Singleton
    @Provides
    fun providePokimonsApiService(netWorkClient: NetWorkClient) =
        netWorkClient.providePokimonsApiService()
}