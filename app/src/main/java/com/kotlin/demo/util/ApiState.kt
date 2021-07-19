package com.kotlin.demo.util

import com.kotlin.demo.model.Post

sealed class ApiState {
    object Loading : ApiState()
    class Failure(val msg: Throwable) : ApiState()
    class Success(val data: List<Post>) : ApiState()
    object Empty : ApiState()
}
