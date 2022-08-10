package com.example.poketest.data.remote.apiservisec

import com.example.poketest.models.PokimonsModel
import retrofit2.http.GET

interface PokimonApiServise {

    @GET("v2")
    suspend fun fetchPokimons(): List<PokimonsModel>
}