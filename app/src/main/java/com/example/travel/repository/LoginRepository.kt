package com.example.travel.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.travel.api.LoginService
import com.example.travel.model.LoginList
import com.example.travel.model.LoginRequest
import retrofit2.Response

class LoginRepository( ) {
//
//    private val loginLiveData = MutableLiveData<LoginList>()
//    val login : LiveData<LoginList>
//    get() = loginLiveData


//    suspend fun loginData(loginRequest: LoginRequest)
//    {
//        val result = loginService.getLogin(loginRequest)
//        if (result.body() != null){
//            loginLiveData.postValue(result.body())
//            Log.d("ABC",result.body().toString())
//        }
//    }

    suspend fun loginUser(loginRequest:LoginRequest): Response<LoginList>? {
        return  LoginService.getApi()?.loginUser(loginRequest = loginRequest)
    }
}
