package com.example.travel.api


import com.example.travel.model.attraction.AttractionList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST


interface AttractionService {

    @GET("products/")
    suspend fun getAttractionList () : Response<AttractionList>
}