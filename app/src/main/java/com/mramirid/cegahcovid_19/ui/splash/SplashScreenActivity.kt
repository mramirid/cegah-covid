package com.mramirid.cegahcovid_19.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mramirid.cegahcovid_19.R
import com.mramirid.cegahcovid_19.ui.DashboardActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val moveToDashboardActivity = Intent(this, DashboardActivity::class.java)
        startActivity(moveToDashboardActivity)
        finish()
    }
}
