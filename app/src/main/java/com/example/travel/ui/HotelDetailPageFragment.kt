package com.example.travel.ui

import android.net.Uri
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.activity.setViewTreeOnBackPressedDispatcherOwner
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.travel.R
import com.example.travel.databinding.CustomToolbarBinding

import com.example.travel.databinding.FragmentHotelDetailPageBinding
import com.example.travel.model.hotelDetail.HotelDetailList
import com.example.travel.model.hotellist.HotelList
import com.example.travel.viewmodel.HotelLisDetailViewModel
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlin.text.Typography.section

class HotelDetailPageFragment() : Fragment() {

    private lateinit var binding: FragmentHotelDetailPageBinding
    private val viewModel by viewModels<HotelLisDetailViewModel>()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotelDetailPageBinding.inflate(layoutInflater)

        setObserver()
        getData()

        ViewCompat.setTransitionName(binding.imageDetailHotel, "card_item_detail")

        val coll_toolbar = binding.collapsingToolbar
        coll_toolbar.title = "Hotail Detail"
//        coll_toolbar.setContentScrimColor(resources.getColor(R.color.brown))
        coll_toolbar.setContentScrimColor(ContextCompat.getColor(requireContext(), R.color.brown))
        coll_toolbar.expandedTitleGravity = Gravity.TOP
        coll_toolbar.setExpandedTitleColor(ContextCompat.getColor(requireContext(), R.color.white))
//        coll_toolbar.setExpandedTitleColor(resources.getColor(R.color.white))
        return binding.root
    }

    private fun getData() {
        val b = Bundle().getBundle("dataObject")
        val a = arguments?.getParcelable<HotelList.Data.AppPresentationQueryAppV2.Section>("dataObject")
        binding.tvDetailHotelName.text = a?.singleCardContent?.cardTitle?.hotelName.toString()
        binding.rbDetailRating.rating = a?.singleCardContent?.bubbleRating?.rating!!
        binding.tvDetailNumOfReview.text = a.singleCardContent?.bubbleRating?.numberReviews?.string
        binding.tvDetailHotelDescription.text = a.singleCardContent?.commerceInfo?.details?.text
        binding.tvDetailPrice.text = a.singleCardContent?.commerceInfo?.priceForDisplay?.string

        val imgUri: Uri = Uri.parse("https://wallpapercave.com/wp/wp8122701.jpg")
        var requestOption = RequestOptions()
        requestOption = requestOption.transform(FitCenter(), RoundedCorners(2))

        Glide.with(this)
            .load(imgUri)
            .centerCrop()
            .apply(requestOption)
            .skipMemoryCache(true)
            .into(binding.imageDetailHotel)
    }

    private fun setObserver() {
        viewModel.getHotelListDetail()
        viewModel.hotelDetailResult.observe(viewLifecycleOwner, Observer {
            Log.d("TAG", it.toString())
        })
    }


}