package com.example.travel.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.travel.api.BaseResponse
import com.example.travel.model.hotelDetail.HotelDetailRequest
import com.example.travel.model.hotellist.HotelList
import com.example.travel.repository.HotelListDetailRepository
import kotlinx.coroutines.launch

class HotelLisDetailViewModel(application: Application) : AndroidViewModel(application) {


    private val hotelDetailRepo = HotelListDetailRepository()
    val hotelDetailResult: MutableLiveData<BaseResponse<HotelList>> = MutableLiveData()
    //val hotelResult1: MutableLiveData<HotelList> = MutableLiveData()

      @SuppressLint("SuspiciousIndentation")

      fun getHotelListDetail()
      {
      hotelDetailResult.value = BaseResponse.Loading()
        viewModelScope.launch {
            try {
                val response = hotelDetailRepo.getHotelListDetail(hotelDetailRequest = HotelDetailRequest
                    (
                    "7307357","2022-03-03","2022-03-05", listOf(HotelDetailRequest.Room(2,
                        listOf(2)
                    ))
                ))


                if (response?.code() == 200) {
                    hotelDetailResult.value = BaseResponse.Success(response.body())
               Log.d("DETAIL","Sucess")
                } else {
                    hotelDetailResult.value = BaseResponse.Error(response?.message())
                    Log.d("DETAIL","error")
                }

            } catch (ex: Exception) {
                hotelDetailResult.value = BaseResponse.Error(ex.message)
                Log.d("DETAIL","error")
            }
       }
   }
}
