package com.kotlin.demo.network

import com.kotlin.demo.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPost(): List<Post>
}