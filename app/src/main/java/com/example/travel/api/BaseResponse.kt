package com.example.travel.api

sealed class BaseResponse<out T> {
    data class Success<out T>(val data: T? = null) : BaseResponse<T>()
    object  Loading : BaseResponse<Nothing>()
    data class Error(val msg: String?) : BaseResponse<Nothing>()
}