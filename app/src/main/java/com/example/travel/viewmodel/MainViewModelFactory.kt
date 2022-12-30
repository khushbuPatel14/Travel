package com.example.travel.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.travel.repository.AttractionRepository


class MainViewModelFactory(private val repository: AttractionRepository) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AttractionViewModel(repository) as T
    }


}

