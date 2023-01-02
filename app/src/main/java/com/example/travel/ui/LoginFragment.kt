package com.example.travel.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.travel.R
import com.example.travel.databinding.FragmentLoginBinding

import com.example.travel.extension.showToast
import com.example.travel.viewmodel.LoginViewModel
import java.security.cert.Extension


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    //  private val passwordPattern = ".{6,}"
    // private val passwordPattern = "^(?=.*[A-Z])(?=.*[!@#\$&*])(?=.*[0-9])(?=.*[a-z]).{6,}\$"
    //  private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+"

    private val viewModel by viewModels<LoginViewModel>()

    @SuppressLint("CommitPrefEdits")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentLoginBinding.inflate(layoutInflater)
        anim()
        intView()


        viewModel.loginResult.observe(viewLifecycleOwner, Observer {
            Log.d("ABC", it.toString())
        })
        return binding.root
    }

    private fun intView() {
        binding.btnLogin.setOnClickListener {
            doLogin()
        }

        binding.tvForsignuplink.movementMethod = LinkMovementMethod.getInstance()

        val cs: ClickableSpan = object : ClickableSpan() {

            override fun onClick(p0: View) {
                findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
            }
        }

        val spannable = SpannableString("Don't have and account? Sign up")

        spannable.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.dark_brown)),
            24,
            31,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )

        spannable.setSpan(
            UnderlineSpan(),
            24,
            31,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
        spannable.setSpan(
            cs,
            24,
            31,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
        binding.tvForsignuplink.text = spannable

    }

    private fun doLogin() {

        val sharedPreferences =
            context?.getSharedPreferences("shareData", AppCompatActivity.MODE_PRIVATE)
        val edUserEmail = binding.edUserEmail
        val edPassword = binding.edPassword

        if (edUserEmail.text?.trim().toString() == "") {
            edUserEmail.error = "Enter Email"
            edUserEmail.requestFocus()
        }
        if (edPassword.text?.trim().toString() == "") {
            edPassword.error = "Enter Password"
            edPassword.requestFocus()
        }

        if (binding.cbRemember.isChecked) {
            sharedPreferences?.edit()?.putBoolean("check", true)?.apply()
        }
            val username = binding.edUserEmail.text.toString()
            val pwd = binding.edPassword.text.toString()
            viewModel.loginUser(username = username, pwd = pwd)

            //Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()
        context?.showToast("Login Successfully")


            findNavController().navigate(R.id.action_loginFragment_to_hotelListFragment)
            edUserEmail.setText("")
            edUserEmail.clearFocus()
            edPassword.setText("")
            edPassword.clearFocus()
    }

    private fun anim() {

        val slideDownAnim = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        binding.imgLogin.animation = slideDownAnim

        val fadeInAnim = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        binding.tvLoginForm.animation = fadeInAnim
    }
}