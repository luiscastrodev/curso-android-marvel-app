package com.example.core.usecase.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject


data class CoroutinesDispatchers(
    val io: CoroutinesDispatchers,
    val computation: CoroutinesDispatchers,
    val main: CoroutinesDispatchers
)

//class AppCoroutinesDispatchers @Inject constructor() : CoroutinesDispatchers