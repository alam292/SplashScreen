package com.example.splashscreen

import android.content.Intent // Import Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        Handler(mainLooper).postDelayed({ // Use mainLooper
            startActivity(Intent(this@SplashScreen, MainActivity::class.java)) // Specify context
            finish()
        }, 3000)
    }
}