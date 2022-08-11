package com.example.poketest.data.remote


import com.example.poketest.data.remote.apiservisec.PokimonApiServise
import javax.inject.Inject

class NetWorkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttpClient: OkHttp
) {

    private val provideRetrofit = retrofitClient.provideRetrofit(okHttpClient.provideOkHttpClient())

    fun providePokimonsApiService() = provideRetrofit.create(PokimonApiServise::class.java)
}