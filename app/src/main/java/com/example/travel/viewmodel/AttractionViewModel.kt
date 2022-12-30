package com.example.travel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.travel.model.attraction.AttractionList
import com.example.travel.repository.AttractionRepository


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AttractionViewModel(private val repository: AttractionRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO){
        repository.getAttractionList() //get data from repository
        }

    }
    val attrac : LiveData<AttractionList>
    get() = repository.attractions // get live data from reposotory

}