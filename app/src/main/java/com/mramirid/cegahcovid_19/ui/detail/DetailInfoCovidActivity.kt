package com.mramirid.cegahcovid_19.ui.detail

import android.os.Build
import android.os.Bundle
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.mramirid.cegahcovid_19.R
import com.mramirid.cegahcovid_19.model.InfoCovid
import kotlinx.android.synthetic.main.activity_detail_info_covid.*

class DetailInfoCovidActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_INFO = "extra_info";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_info_covid)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val infoCovid = intent.extras?.get(EXTRA_INFO) as InfoCovid

        supportActionBar?.title = infoCovid.title
        Glide.with(applicationContext)
            .load(infoCovid.image)
            .into(img_poster)
        tv_description.text = infoCovid.description

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Justify text
            tv_description.justificationMode = JUSTIFICATION_MODE_INTER_WORD
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
