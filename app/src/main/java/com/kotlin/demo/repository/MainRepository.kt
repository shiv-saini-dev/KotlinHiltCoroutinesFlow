package com.kotlin.demo.repository

import com.kotlin.demo.model.Post
import com.kotlin.demo.network.ApiServiceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepository
@Inject
constructor(private val apiServiceImpl: ApiServiceImpl) {

    fun getPost(): Flow<List<Post>> = flow {
        emit(apiServiceImpl.getPost())
    }.flowOn(Dispatchers.IO)

}