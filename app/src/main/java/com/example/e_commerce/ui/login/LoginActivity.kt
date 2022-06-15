package com.example.e_commerce.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.e_commerce.R
import com.example.e_commerce.databinding.ActivityLoginBinding
import com.example.e_commerce.ui.base.BaseActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(
    layoutId = R.layout.activity_login,
    viewModelClass = LoginViewModel::class.java
) {
    private lateinit var navController: NavController
    override fun onInitDataBinding() {
        navController = findNavController(R.id.fragmentContainerView2)
        setupActionBarWithNavController(navController)

    }

    //For back proccess
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


}