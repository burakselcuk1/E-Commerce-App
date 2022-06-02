package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val anim = findViewById<LottieAnimationView>(R.id.animationView)

        Handler(Looper.getMainLooper()).postDelayed({
            anim.playAnimation()
        },2000)

    }
}