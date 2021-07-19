package com.kotlin.demo.network

import com.kotlin.demo.model.Post
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(private val apiService: ApiService) {

    suspend fun getPost(): List<Post> = apiService.getPost()
}