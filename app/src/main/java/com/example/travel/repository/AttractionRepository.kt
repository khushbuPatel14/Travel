package com.example.travel.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.travel.api.AttractionService
import com.example.travel.model.attraction.AttractionList


class AttractionRepository(private val attractionService: AttractionService) {

    private val attractionLiveData =
        MutableLiveData<AttractionList>() //create object of mutable live data
    val attractions: LiveData<AttractionList> // object of live data
        get() = attractionLiveData // get mutable live data as live data

    suspend fun getAttractionList() {
         //call service function call and store it on
        try {
            val result =
                attractionService.getAttractionList()
            if (result.body() != null) {
                //if is not null then get all mutable live data
                attractionLiveData.postValue(result.body()) //post value is for pass response to view-model
                Log.d("ATTRACTION", result.body().toString())
            }
        } catch (e: Exception) {
            Log.d("ATTRACTION", e.message.toString())
        }
    }
}