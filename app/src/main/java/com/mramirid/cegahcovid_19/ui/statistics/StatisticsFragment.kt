package com.mramirid.cegahcovid_19.ui.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.mramirid.cegahcovid_19.R
import kotlinx.android.synthetic.main.fragment_statistics.*

class StatisticsFragment : Fragment() {

    private val statisticsViewModel by viewModels<StatisticsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_statistics, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        statisticsViewModel.fetchStatus()
        statisticsViewModel.getStatusCovidId().observe(viewLifecycleOwner, Observer { statusCovid ->
            tv_total_positive.text = statusCovid.positif
            tv_total_recovered.text = statusCovid.sembuh
            tv_total_death.text = statusCovid.meninggal
        })

        statisticsViewModel.getStatusRequest().observe(viewLifecycleOwner, Observer { hasReceived ->
            if (!hasReceived) {
                Toast.makeText(context, "Tidak dapat terhubung ke internet, coba lagi nanti", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
