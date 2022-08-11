package com.example.poketest.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.poketest.databinding.ItemPokemonBinding
import com.example.poketest.models.PokimonsModel
import kotlin.reflect.KFunction1

class PokemonAdapter(
) : androidx.recyclerview.widget.ListAdapter<PokimonsModel, PokemonAdapter.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPokemonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }


    inner class ViewHolder(
        private val binding: ItemPokemonBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: PokimonsModel) {
            binding.itemHeroesName.text = item.name

            binding.root.setOnClickListener {
            }
        }
    }

    companion object {

        private val diffCallback: DiffUtil.ItemCallback<PokimonsModel> =
            object : DiffUtil.ItemCallback<PokimonsModel>() {
                override fun areItemsTheSame(
                    oldItem: PokimonsModel,
                    newItem: PokimonsModel
                ): Boolean {
                    return oldItem.id == newItem.id
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(
                    oldItem: PokimonsModel,
                    newItem: PokimonsModel
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }
}
