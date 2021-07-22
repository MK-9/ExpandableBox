package com.example.expandablebox

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.ui.NavigationUI
import com.example.expandablebox.base.BaseActivity
import com.example.expandablebox.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        startDestination()
    }

    private fun startDestination() {
        val navController = navHostFragment.navController
        navController.navInflater
            .inflate(R.navigation.main_nav_graph)
            .apply {
                startDestination = R.id.searchFragment
            }.apply {
                navController.graph = this
            }

        NavigationUI.setupWithNavController(binding.bottomNavigation, navController)
    }


}