package com.example.travel.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.travel.adapter.AttractionListAdapter
import com.example.travel.api.ApiClient
import com.example.travel.api.ApiClientAttraction
import com.example.travel.api.AttractionService
import com.example.travel.databinding.FragmentAttractionBinding
import com.example.travel.model.attraction.AttractionList
import com.example.travel.repository.AttractionRepository
import com.example.travel.viewmodel.AttractionViewModel
import com.example.travel.viewmodel.MainViewModelFactory

class AttractionFragment : Fragment() {
    private lateinit var binding: FragmentAttractionBinding
    private lateinit var mainViewModel: AttractionViewModel

    private lateinit var adapter: AttractionListAdapter
    private val myList = ArrayList<AttractionList.Product>()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentAttractionBinding.inflate(layoutInflater)
        adapter = AttractionListAdapter(this, myList)
        binding.rvProductList.adapter = adapter
        val attractionService = ApiClientAttraction.apiclientAttraction?.create(AttractionService::class.java)

        val repository =attractionService?.let { AttractionRepository(it) }

        //give all to view-model
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository!!))[AttractionViewModel::class.java]


//observe live data from view-model

        mainViewModel.attrac.observe(viewLifecycleOwner, Observer {

            Log.d("ATTRACTION",it.products.toString())

            myList.clear()
            myList.addAll(it.products as ArrayList<AttractionList.Product>)


            adapter.notifyDataSetChanged()

        })


        return binding.root
    }

}