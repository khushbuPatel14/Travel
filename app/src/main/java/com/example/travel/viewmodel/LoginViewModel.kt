package com.example.travel.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.travel.api.BaseResponse
import com.example.travel.model.LoginList
import com.example.travel.model.LoginRequest
import com.example.travel.repository.LoginRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(application: Application) : AndroidViewModel(application) {


    private val loginRepo = LoginRepository()
    val loginResult: MutableLiveData<BaseResponse<LoginList>> = MutableLiveData()

    fun loginUser(username :String,pwd: String) {

        loginResult.value = BaseResponse.Loading()
        viewModelScope.launch {
            try {

                val loginRequest = LoginRequest(

                    username = username,
                    password = pwd
                )
                val response = loginRepo.loginUser(loginRequest = loginRequest)
                if (response?.code() == 200) {
                    loginResult.value = BaseResponse.Success(response.body())
                } else {
                    loginResult.value = BaseResponse.Error(response?.message())
                }

            } catch (ex: Exception) {
                loginResult.value = BaseResponse.Error(ex.message)
            }
        }
    }
}
