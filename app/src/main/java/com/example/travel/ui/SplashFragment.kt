package com.example.travel.ui

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import androidx.navigation.fragment.findNavController
import com.example.travel.MainActivity
import com.example.travel.R
import com.example.travel.databinding.ActivityMainBinding
import com.example.travel.databinding.FragmentIntroBinding
import com.example.travel.databinding.FragmentSplashBinding
import com.google.android.material.snackbar.Snackbar

class SplashFragment : Fragment() {


    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSplashBinding.inflate(layoutInflater)

        Handler(Looper.getMainLooper()).postDelayed({
           loadFragment()
           // findNavController().navigate(R.id.action_splashFragment_to_hotelListFragment)
        }, 1000)

      return binding.root

    }
    private fun loadFragment()
    {

        val sharedPreferences = context?.getSharedPreferences("shareData", AppCompatActivity.MODE_PRIVATE)
        Log.d("SPABC", sharedPreferences?.contains("check").toString())
        var loginCheck = false
        if (sharedPreferences?.contains("check") == true)
        {

          loginCheck = sharedPreferences.getBoolean("check",false)

        }
        if (loginCheck)
        {
            findNavController().navigate(R.id.action_splashFragment_to_hotelListFragment)

        }
        else
        {
            findNavController().navigate(R.id.action_splashFragment_to_introFragment)
        }
    }

}