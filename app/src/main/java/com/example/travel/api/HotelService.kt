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
        "X-RapidAPI-Key:f8011c6077msh9e1315ecd4f7a34p16a16djsnc288c98f0e35",
        "X-RapidAPI-Host:travel-advisor.p.rapidapi.com")

    suspend fun getHotelList(@Body hotelRequest: HotelRequest): Response<HotelList>

    companion object {

        fun getApiHotel(): HotelListService? {
            return ApiClient.clientHotel?.create(HotelListService::class.java)
        }
    }

}