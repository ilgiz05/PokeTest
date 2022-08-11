package com.example.poketest.data.repository

import androidx.lifecycle.liveData

import com.example.poketest.Either
import com.example.poketest.data.remote.apiservisec.PokimonApiServise
import kotlinx.coroutines.Dispatchers
import java.io.IOException
import javax.inject.Inject

class PokimonRepository @Inject constructor(private val apiService: PokimonApiServise) {

    fun fetchPokimons() = liveData (Dispatchers.IO) {
        try {
            emit(Either.Right(apiService.fetchPokimons()))
        } catch (ioException: IOException) {
            emit(Either.Left(ioException.localizedMessage))
        }
    }
}