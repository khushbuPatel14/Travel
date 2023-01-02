package com.example.travel.extension

import android.content.Context
import android.widget.EditText
import android.widget.Toast


private const val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+"

private const val passwordPattern = ".{6,}"


fun Context.showToast(
    message: String, length: Int = Toast.LENGTH_SHORT
) {
    Toast.makeText(this, message, length).show()
}

fun EditText.isValidEmail(): Boolean {

    val email = text.toString()
    return if (email.isEmpty()) {
        error = "Please enter email id"
        false
    } else if (!email.matches(emailPattern.toRegex())) {
        error = "Enter valid email"
        false
    } else {
        error = null
        true
    }

}

fun EditText.validatePassword(): Boolean {

    val password = text.toString()

    return if (password.isEmpty()) {
        error = "password is empty"
        false
    } else if (!password.matches(passwordPattern.toRegex())) {
        error = "password is too week"
        false
    } else {
        error = null
        true
    }
}

fun EditText.validateConfirmPassword(): Boolean {

    val password = text.toString()

    return if (password.isEmpty()) {
        error = "password is empty"
        false
    } else if (!password.matches(passwordPattern.toRegex())) {
        error = "password is too week"
        false
    } else {
        error = null
        true
    }
}

fun EditText.validateNameText(): Boolean {

    val nameText = text.toString()

    return if (nameText.isNotEmpty()) {
        error = "Enter name"
        false
    } else {
        error = null
        true
    }
}





