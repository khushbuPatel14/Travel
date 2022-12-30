package com.example.travel.api

import com.example.travel.model.LoginList
import com.example.travel.model.LoginRequest
import com.example.travel.model.hotelDetail.HotelDetailRequest
import com.example.travel.model.hotellist.HotelList
import com.example.travel.model.hotellist.HotelRequest
import retrofit2.Response
import retrofit2.http.*

interface LoginService {

    @POST("/auth/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginList>

    companion object {

        fun getApi(): LoginService? {
            return ApiClient.client?.create(LoginService::class.java)
        }
    }

}

