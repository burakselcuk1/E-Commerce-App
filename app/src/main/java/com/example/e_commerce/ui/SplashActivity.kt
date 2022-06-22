package com.example.e_commerce.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatDelegate
import com.example.e_commerce.MainActivity
import com.example.e_commerce.R
import com.example.e_commerce.databinding.ActivitySplashBinding
import com.example.e_commerce.ui.base.BaseActivity
import com.example.e_commerce.ui.login.LoginActivity
import com.example.e_commerce.viewModels.SplashViewModel

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(
    layoutId = R.layout.activity_splash,
    viewModelClass = SplashViewModel::class.java
) {

    override fun onInitDataBinding() {
        //For disenable dark mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
        supportActionBar?.hide()
          }
}