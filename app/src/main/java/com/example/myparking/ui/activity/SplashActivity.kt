package com.example.myparking.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myparking.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            //finishedAnimation = false
            //if(user != null) {

                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()

            //} else {
//                val intent = Intent(this, SignupActivity::class.java)
//                startActivity(intent)
//                finish()
            //}

        }, 3000) // 3000 is the delayed time in milliseconds.

    }
}