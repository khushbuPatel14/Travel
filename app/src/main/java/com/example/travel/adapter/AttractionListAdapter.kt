package com.example.travel.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

import com.example.travel.databinding.ItemProductListBinding
import com.example.travel.model.attraction.AttractionList
import com.example.travel.ui.AttractionFragment

class AttractionListAdapter(private val context: AttractionFragment, private val myList: ArrayList<AttractionList.Product>)
    : RecyclerView.Adapter<AttractionListAdapter.ViewHolder>(){

    private lateinit var binding: ItemProductListBinding

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =ItemProductListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var requestOption = RequestOptions()
        requestOption = requestOption.transform(FitCenter(),RoundedCorners(2))

        val image = myList[position].thumbnail.toString()

        Glide.with(context)
            .load(image)
            .apply(requestOption)
            .skipMemoryCache(true)
            .into(binding.imgCardHotel)

       binding.data = myList[position]

    }

    override fun getItemCount(): Int {
       return myList.size
    }

}
