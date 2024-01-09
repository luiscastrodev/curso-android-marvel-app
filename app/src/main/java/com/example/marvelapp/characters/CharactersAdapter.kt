package com.example.marvelapp.characters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.core.domain.model.Character

class CharactersAdapter : ListAdapter<Character, CharactresViewHolder>(diffCallBack) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactresViewHolder {
        return CharactresViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: CharactresViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    companion object {
        private val diffCallBack = object : DiffUtil.ItemCallback<Character>() {
            override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
                return oldItem == newItem
            }
        }
    }

}