package com.ikkifik.myandroidapp.rapsodiapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        splash_screen.alpha = 0f
        splash_screen.animate().setDuration(8000).alpha(1f).withEndAction {
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}