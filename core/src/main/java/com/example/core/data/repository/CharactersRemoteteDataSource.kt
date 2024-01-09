package com.example.core.data.repository

interface CharactersRemoteteDataSource<T> {
    suspend fun fetchCharacters(queries: Map<String, String>): T
}