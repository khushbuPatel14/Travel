package com.example.travel.repository


import com.example.travel.api.HotelListDetailService
import com.example.travel.api.HotelListService
import com.example.travel.model.hotelDetail.HotelDetailRequest
import com.example.travel.model.hotellist.HotelList
import com.example.travel.model.hotellist.HotelRequest
import retrofit2.Response

class HotelListDetailRepository {

    suspend fun getHotelListDetail(hotelDetailRequest: HotelDetailRequest): Response<HotelList>? {
        return  HotelListDetailService.getApiHotelDetail()?.getHotelListDetail(hotelDetailRequest = hotelDetailRequest )

    }
}