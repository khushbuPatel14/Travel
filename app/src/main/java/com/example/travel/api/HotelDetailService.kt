package com.example.travel.api

import com.example.travel.model.hotelDetail.HotelDetailRequest
import com.example.travel.model.hotellist.HotelList
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface HotelListDetailService {

    @POST("hotels/v2/get-details")
    @Headers(
        "Content-Type:application/json",
        "X-RapidAPI-Key:f8011c6077msh9e1315ecd4f7a34p16a16djsnc288c98f0e35",
        "X-RapidAPI-Host:travel-advisor.p.rapidapi.com")

    suspend fun getHotelListDetail(@Body hotelDetailRequest: HotelDetailRequest): Response<HotelList>

    companion object {

        fun getApiHotelDetail(): HotelListDetailService? {
            return ApiClient.clientHotelDetail?.create(HotelListDetailService::class.java)
        }
    }

}