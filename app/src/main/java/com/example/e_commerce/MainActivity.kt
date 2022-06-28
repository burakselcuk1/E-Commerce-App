package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.airbnb.lottie.LottieAnimationView
import com.example.e_commerce.databinding.ActivityMainBinding
import com.example.e_commerce.ui.base.BaseActivity
import com.example.e_commerce.viewModels.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    layoutId = R.layout.activity_main,
    viewModelClass = MainViewModel::class.java
) {
    private lateinit var navController: NavController

    override fun onInitDataBinding() {

        //Init BottomNavMenu
        navController = findNavController(R.id.fragmentContainerView)
        setupWithNavController(binding.bottomNavigationView4,navController)

        //Init Toolbar
        setSupportActionBar(findViewById(R.id.toolbar2))
        val navController = findNavController(R.id.fragmentContainerView)
        val config = AppBarConfiguration(navController.graph)
        findViewById<Toolbar>(R.id.toolbar2).setupWithNavController(navController, config)


    }



}