package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
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
        //Bottom Nav Menu

        navController = findNavController(R.id.fragmentContainerView)
        setupWithNavController(binding.bottomNavigationView4,navController)
        setupActionBarWithNavController(navController)
    }

    //For back proccess
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}