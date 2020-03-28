package com.mramirid.cegahcovid_19.ui.home

import androidx.lifecycle.ViewModel
import com.mramirid.cegahcovid_19.helper.DataCovid
import com.mramirid.cegahcovid_19.model.InfoCovid

class HomeViewModel : ViewModel() {

    private lateinit var infoCovidList: List<InfoCovid>

    fun getInfoCovidList(): List<InfoCovid> {
        if (!this::infoCovidList.isInitialized) {
            infoCovidList = DataCovid.getInfoCovidList()
        }

        return infoCovidList
    }
}