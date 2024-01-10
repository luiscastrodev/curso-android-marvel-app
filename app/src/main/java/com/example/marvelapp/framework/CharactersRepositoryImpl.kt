package com.example.marvelapp.framework

import androidx.paging.PagingSource
import com.example.core.data.repository.CharactersRemoteteDataSource
import com.example.core.data.repository.CharactersRepository
import com.example.core.domain.model.Character
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.example.marvelapp.framework.paging.CharactersPagingSource
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val remoteteDataSource: CharactersRemoteteDataSource<DataWrapperResponse>
) : CharactersRepository {
    override fun getCharacters(query: String): PagingSource<Int, Character> {
        return CharactersPagingSource(remoteteDataSource, query)
    }
}