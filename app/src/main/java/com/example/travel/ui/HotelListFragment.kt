package com.example.travel.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.travel.MainActivity
import com.example.travel.R
import com.example.travel.`interface`.ClickForDetail
import com.example.travel.adapter.HotelListAdapter
import com.example.travel.api.BaseResponse
import com.example.travel.databinding.FragmentHotelListBinding

import com.example.travel.model.hotelDetail.HotelDetailRequest
import com.example.travel.model.hotellist.HotelList
import com.example.travel.viewmodel.HotelListViewModel
import com.google.android.material.snackbar.Snackbar
import okhttp3.internal.notifyAll

class HotelListFragment : Fragment(), ClickForDetail {

    private lateinit var binding: FragmentHotelListBinding
    private lateinit var adapter: HotelListAdapter

    private val myList = ArrayList<HotelList.Data.AppPresentationQueryAppV2.Section>()

    private val viewModel by viewModels<HotelListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHotelListBinding.inflate(layoutInflater)



        initView()
        setUpObserver()

        Log.d("TAG", this.toString())
        return binding.root
    }

    private fun initView() {

    }

    override fun onItemClickDetail(section: HotelList.Data.AppPresentationQueryAppV2.Section) {
        val dataObject = HotelDetailRequest()


        val hotelListFragment = HotelListFragment()
        val b = Bundle()
        b.putParcelable("dataObject", section)
        //hotelListFragment.arguments = b
        findNavController().navigate(R.id.action_hotelListFragment_to_hotelDetailPageFragment, b)

        ViewCompat.setTransitionName(binding.rvHotelList , "card_item")



    }

    private fun setUpObserver() {
        viewModel.getHotelList()

        viewModel.hotelResult.observe(viewLifecycleOwner, Observer {

            Log.d("TAG", it.toString())

            when (it) {
                is BaseResponse.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is BaseResponse.Success -> {
                    /*it.data.let {
                        it?.data.let {
                            it?.appPresentationQueryAppListV2
                        }
                    }*/

                    binding.progressBar.visibility = View.GONE

                    Log.d(
                        "IMAGE",
                        it.data?.data?.appPresentationQueryAppListV2?.get(0)?.sections?.get(9)?.singleCardContent?.cardPhotos?.get(
                            0
                        )?.sizes?.urlTemplate.toString()
                    )
                    myList.clear()
                    myList.addAll(it.data?.data?.appPresentationQueryAppListV2?.get(0)?.sections as ArrayList<HotelList.Data.AppPresentationQueryAppV2.Section>)
//myList.add(it.data?.data?.appPresentationQueryAppListV2?.get(0)?.sections?.get(9)?.singleCardContent?.cardTitle?.hotelName)
                    searchData()
                     myList.notifyAll()
                }
                else -> {}
            }
            adapter = HotelListAdapter(this, myList, this)
            binding.rvHotelList.adapter = adapter
        })
    }

    private fun searchData() {

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                adapter.filter.filter(p0)
                return true
            }
        })
    }
}