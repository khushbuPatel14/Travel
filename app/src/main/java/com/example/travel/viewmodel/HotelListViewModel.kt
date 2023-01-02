package com.example.travel.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.example.travel.api.BaseResponse
import com.example.travel.model.hotellist.HotelList
import com.example.travel.model.hotellist.HotelRequest
import com.example.travel.repository.HotelListRepository
import kotlinx.coroutines.launch

class HotelListViewModel(application: Application) : AndroidViewModel(application) {


    private val hotelRepo = HotelListRepository()
    val hotelResult: MutableLiveData<BaseResponse<HotelList>> = MutableLiveData()

  //  val liveData : LiveData<BaseResponse<HotelList>>
   // get() = liveData

    //val hotelResult1: MutableLiveData<HotelList> = MutableLiveData()

      @SuppressLint("SuspiciousIndentation")
      fun getHotelList(){

      hotelResult.value = BaseResponse.Loading()
        viewModelScope.launch {
            try {
                val response = hotelRepo.getHotelList(hotelRequest = HotelRequest(293928))
                if (response?.code() == 200) {
                    hotelResult.value = BaseResponse.Success(response.body())
               Log.d("DISPLAY","Sucess")
                } else {
                    hotelResult.value = BaseResponse.Error(response?.message())
                    Log.d("DISPLAY","error")
                }

            } catch (ex: Exception) {
                hotelResult.value = BaseResponse.Error(ex.message)
                Log.d("DISPLAY",ex.message.toString())
            }
       }
   }

}
