package com.example.poketest.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.poketest.Either
import com.example.poketest.R
import com.example.poketest.base.BaseFragment
import com.example.poketest.databinding.FragmentPokemonBinding
import com.example.poketest.ui.adapter.PokemonAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokemonFragment :
    BaseFragment<PokemonViewModel, FragmentPokemonBinding>(
        R.layout.fragment_pokemon
    ) {


    override val binding by viewBinding(FragmentPokemonBinding::bind)
    override val viewModel: PokemonViewModel by viewModels()
    private val pokemon = PokemonAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() = with(binding.recyclerPokemon) {
        layoutManager = LinearLayoutManager(requireContext())
        adapter = pokemon
    }

    override fun setupSubscribes() {
        setupObserv()
    }

    private fun setupObserv() {
        viewModel.fetchpokemon().observe(viewLifecycleOwner) {
            when (it) {
                is Either.Left -> {
                    Log.e("anime", it.value)
                }

                is Either.Right -> {
                    Log.e("Anime", it.value.toString())
                    pokemon.submitList(it.value?.results)

                }
            }
        }
    }
}

