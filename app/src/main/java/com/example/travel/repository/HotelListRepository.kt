package com.example.travel.repository


import com.example.travel.api.HotelListService
import com.example.travel.model.hotellist.HotelList
import com.example.travel.model.hotellist.HotelRequest
import retrofit2.Response

class HotelListRepository {

    suspend fun getHotelList(hotelRequest: HotelRequest): Response<HotelList>? {
        return  HotelListService.getApiHotel()?.getHotelList(hotelRequest = hotelRequest)

    }
}