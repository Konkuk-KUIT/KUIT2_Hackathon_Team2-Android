package com.example.kuit_hackerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.kuit_hackerton.databinding.ActivityMainBinding
import com.example.kuit_hackerton.databinding.ActivitySplashBinding

class SplashActivity : ComponentActivity() {
    lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

            val myIntent = Intent(this, RestaurantActivity::class.java)
            // startActivity를 해야 화면이동
            startActivity(myIntent)
            //intent flag제거해서 백스택 안 오게

    }

}