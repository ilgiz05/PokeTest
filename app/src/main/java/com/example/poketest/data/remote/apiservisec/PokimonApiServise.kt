package com.example.poketest.data.remote.apiservisec

import com.example.poketest.models.PokemonResponse
import com.example.poketest.models.PokimonsModel
import retrofit2.http.GET

interface PokimonApiServise {

    @GET("pokemon")
    suspend fun fetchPokimons(
    ): PokemonResponse<PokimonsModel>?
}