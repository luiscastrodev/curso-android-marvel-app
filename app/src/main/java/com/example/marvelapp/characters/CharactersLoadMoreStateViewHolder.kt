package com.example.marvelapp.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelapp.databinding.ItemCharacterMoreStateBinding

class CharactersLoadMoreStateViewHolder(
    itemBinding: ItemCharacterMoreStateBinding,
    retry: () -> Unit
) : RecyclerView.ViewHolder(itemBinding.root) {

    private val binding = ItemCharacterMoreStateBinding.bind(itemView)
    private val progressBarLoadingMore = binding.progressLoadingMore
    private val textTryAgainMessage = binding.textTryAgain.also {
        it.setOnClickListener {
            retry()
        }
    }

    fun bind(
        loadeState: LoadState
    ) {
        progressBarLoadingMore.isVisible = loadeState is LoadState.Loading
        textTryAgainMessage.isVisible = loadeState is LoadState.Error
    }

    companion object {
        fun create(parent: ViewGroup, retry: () -> Unit): CharactersLoadMoreStateViewHolder {
            val itemBinding = ItemCharacterMoreStateBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return CharactersLoadMoreStateViewHolder(itemBinding, retry)
        }
    }
}