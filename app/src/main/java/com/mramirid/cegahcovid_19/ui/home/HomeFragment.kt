package com.mramirid.cegahcovid_19.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mramirid.cegahcovid_19.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private val homeViewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val infoCovidAdapter = InfoCovidAdapter(activity!!, homeViewModel.getInfoCovidList())

        rv_info_covid.layoutManager = LinearLayoutManager(context)
        rv_info_covid.setHasFixedSize(true)
        rv_info_covid.adapter = infoCovidAdapter
    }
}
