package com.example.travel.ui

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
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.travel.FireStore
import com.example.travel.R
import com.example.travel.databinding.FragmentSignupBinding
import com.example.travel.extension.*
import com.example.travel.model.SignupDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class SignupFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding

    private lateinit var  mAuth: FirebaseAuth


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSignupBinding.inflate(layoutInflater)

        mAuth = FirebaseAuth.getInstance()


        checkValidation()
        spannableText()
        return binding.root
    }


    private fun spannableText() {

        binding.tvForRegistersignuplink.movementMethod = LinkMovementMethod.getInstance()

        val cs: ClickableSpan = object : ClickableSpan() {

            override fun onClick(p0: View) {
                findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
            }
        }

        val spannable = SpannableString("Don't have and account? Log In")

        spannable.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.dark_brown)),
            24,
            30,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )

        spannable.setSpan(
            UnderlineSpan(),
            24,
            30,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
        spannable.setSpan(
            cs,
            24,
            30,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
        binding.tvForRegistersignuplink.text = spannable
    }

    private fun checkValidation() {


        val edSignUpFullName = binding.edSignupFullName
        val edSignUpEmail = binding.edSignupEmail
        val edSignUpPassword = binding.edSignupPassword
        val edSignUpConfirmPassword = binding.edSignupConfirmPassword

        binding.btnSignup.setOnClickListener {

            if (!edSignUpFullName.validateNameText()) {
                edSignUpFullName.requestFocus()
            } else if (!edSignUpEmail.isValidEmail()) {
                edSignUpEmail.requestFocus()
            } else if (!edSignUpPassword.validatePassword()) {
                edSignUpPassword.requestFocus()

            } else if (!edSignUpConfirmPassword.validateConfirmPassword()) {
                edSignUpConfirmPassword.requestFocus()

            } else if (!edSignUpConfirmPassword.text?.trim().toString()
                    .contentEquals(edSignUpPassword.text.toString())
            ) {
                edSignUpConfirmPassword.error = "Enter Confirm password same as password"
                edSignUpConfirmPassword.requestFocus()

            } else {

                mAuth.createUserWithEmailAndPassword(edSignUpEmail.text.toString().trim(),edSignUpPassword.text.toString().trim()).addOnCompleteListener(requireActivity()) {
                    if (it.isSuccessful) {
                        Toast.makeText(context, "Successfully Singed Up", Toast.LENGTH_SHORT).show()
                       val user = SignupDatabase(edSignUpEmail.text.toString(),edSignUpPassword.text.toString())
                        FireStore().registerUser(this,user)
                    }
                    else {

                        Log.d("FIRE",it.exception.toString())

                        context?.showToast("Registration Failed",Toast.LENGTH_SHORT)
                    }
                }


            }
        }
    }

    fun userRegisteredSuccess() {

        FirebaseAuth.getInstance().signOut()
        findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
    }


}