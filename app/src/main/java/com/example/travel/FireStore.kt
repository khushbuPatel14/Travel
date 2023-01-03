package com.example.travel

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.travel.extension.showToast
import com.example.travel.model.SignupDatabase
import com.example.travel.ui.SignupFragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.auth.User

class FireStore {

    private val mFireStore = FirebaseFirestore.getInstance()

    fun registerUser(fragment: SignupFragment, userInfo: SignupDatabase) {

        mFireStore.collection("users")

            .document(getCurrentUserID())

            .set(userInfo, SetOptions.merge())
            .addOnSuccessListener {
                fragment.userRegisteredSuccess()
            }
            .addOnFailureListener { e ->
              Log.d("FIRESTORE",e.message.toString())
            }
    }

    private fun getCurrentUserID(): String {
        val currentUser = FirebaseAuth.getInstance().currentUser
        var currentUserID = ""
        if (currentUser != null) {
            currentUserID = currentUser.uid
        }
        return currentUserID
    }

}