package com.example.poketest.models

import com.google.gson.annotations.SerializedName

data class PokemonResponse<T>(

    @SerializedName("count")
    val count: Int,

    @SerializedName("results")
    val results: ArrayList<T>,

    @SerializedName("next")
    val next: String,

    @SerializedName("previous")
    val previous: String
)
