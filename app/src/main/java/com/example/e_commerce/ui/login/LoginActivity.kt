package com.example.e_commerce.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.e_commerce.R
import com.example.e_commerce.databinding.ActivityLoginBinding
import com.example.e_commerce.ui.base.BaseActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(
    layoutId = R.layout.activity_login,
    viewModelClass = LoginViewModel::class.java
) {
    override fun onInitDataBinding() {
        setSupportActionBar(findViewById(R.id.toolbar))
        val navController = findNavController(R.id.fragmentContainerView2)
        val config = AppBarConfiguration(navController.graph)

        findViewById<Toolbar>(R.id.toolbar).setupWithNavController(navController, config)

    }




}