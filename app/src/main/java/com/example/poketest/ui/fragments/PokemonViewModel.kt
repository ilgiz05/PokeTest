package com.example.poketest.ui.fragments

import com.example.poketest.base.BaseViewModel
import com.example.poketest.data.repository.PokimonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(private val repository: PokimonRepository) :
    BaseViewModel() {

    fun fetchpokemon() = repository.fetchPokimons()
    }