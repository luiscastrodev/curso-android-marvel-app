package com.example.marvelapp.framework.remote

import com.example.core.data.repository.CharactersRemoteteDataSource
import com.example.marvelapp.framework.network.MarvelAPI
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import javax.inject.Inject

class RetrofitCharactersDataSource @Inject constructor(
    private val marvelAPI: MarvelAPI
) : CharactersRemoteteDataSource<DataWrapperResponse> {
    override suspend fun fetchCharacters(queries: Map<String, String>): DataWrapperResponse {
        return marvelAPI.getCharacters(queries)
    }
}