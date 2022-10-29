package com.example.res_q

import android.os.Bundle
import android.view.ViewTreeObserver
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity:AppCompatActivity(R.layout.splash_activity) {
    private lateinit var bg: ImageView
    private lateinit var logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}