package com.example.travel.api

import com.example.travel.model.hotellist.HotelList
import com.example.travel.model.hotellist.HotelRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface HotelListService {

    @POST("hotels/v2/list")
    @Headers(
        "Content-Type:application/json",
        "X-RapidAPI-Key:67d1da7063msh53973a1a05bf220p1a9b2bjsn3eb83cadadbe",
        "X-RapidAPI-Host:travel-advisor.p.rapidapi.com")

    suspend fun getHotelList(@Body hotelRequest: HotelRequest): Response<HotelList>

    companion object {

        fun getApiHotel(): HotelListService? {
            return ApiClientHotelList.clientHotel?.create(HotelListService::class.java)
        }
    }

}