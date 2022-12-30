package com.example.travel

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.travel.databinding.ActivityMainBinding

import com.google.android.material.appbar.MaterialToolbar

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var toolbar: MaterialToolbar

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNav()
        binding.logout.setOnClickListener {

            val sharedPreferences =
               getSharedPreferences("shareData", AppCompatActivity.MODE_PRIVATE)
            val edit = sharedPreferences?.edit()

            edit?.clear()
            edit?.apply()
            Snackbar.make(it, "Logout Successfully", Snackbar.LENGTH_SHORT).show()
           navController.navigate(R.id.action_hotelListFragment_to_loginFragment)
        }
    }

    //
    private fun setupNav() {
        bottomNavigationView = binding.bottomNavigation
        toolbar = binding.mainToolbar

        navController = findNavController(R.id.mainFragment)
        NavigationUI.setupWithNavController(bottomNavigationView,navController)


        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.hotelListFragment -> {
                    showBottomNav()
                }

                R.id.attractionFragment ->
                {
                    showBottomNav()

                }

                else -> hideBottomNav()
            }
        }
    }
    dsgfjsdkghfdlh

    private fun showBottomNav() {
        binding.bottomNavigation.visibility = View.VISIBLE
        binding.mainToolbar.visibility = View.VISIBLE


    }

    private fun hideBottomNav() {
        binding.bottomNavigation.visibility = View.GONE
        binding.mainToolbar.visibility = View.GONE
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//
//    }


}