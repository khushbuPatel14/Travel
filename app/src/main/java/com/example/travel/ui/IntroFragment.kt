package com.example.travel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.example.travel.R
import com.example.travel.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    private lateinit var binding: FragmentIntroBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentIntroBinding.inflate(layoutInflater)


        val slideDownAnim = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        binding.tvScreenLine.animation = slideDownAnim

        btnClick()

        return binding.root

    }

    fun btnClick()
    {
        binding.btnScreenLogin.setOnClickListener {
            findNavController().navigate(R.id.action_introFragment_to_loginFragment)
        }

        binding.btnScreenSignup.setOnClickListener {
            findNavController().navigate(R.id.action_introFragment_to_signupFragment)
        }
    }

}