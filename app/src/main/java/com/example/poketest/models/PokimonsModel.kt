package com.example.poketest.models

import com.google.gson.annotations.SerializedName

data class PokimonsModel(

    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

)

