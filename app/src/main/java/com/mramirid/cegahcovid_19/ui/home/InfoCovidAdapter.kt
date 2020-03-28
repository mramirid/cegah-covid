package com.mramirid.cegahcovid_19.ui.home

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mramirid.cegahcovid_19.R
import com.mramirid.cegahcovid_19.model.InfoCovid
import com.mramirid.cegahcovid_19.ui.detail.DetailInfoCovidActivity
import com.mramirid.cegahcovid_19.ui.detail.DetailInfoCovidActivity.Companion.EXTRA_INFO
import kotlinx.android.synthetic.main.info_item.view.*

class InfoCovidAdapter(
    private val activity: Activity,
    private val infoCovidList: List<InfoCovid>
) : RecyclerView.Adapter<InfoCovidAdapter.InfoCovidViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InfoCovidViewHolder {
        return InfoCovidViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.info_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: InfoCovidViewHolder, position: Int) {
        holder.bindView(infoCovidList[position])
    }

    override fun getItemCount() = infoCovidList.size

    inner class InfoCovidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(infoCovid: InfoCovid) {
            with(itemView) {
                Glide.with(itemView)
                    .load(infoCovid.icon)
                    .into(img_icon_info)

                tv_title_info.text = infoCovid.title
            }

            itemView.setOnClickListener {
                val moveToDetailInfoCovid = Intent(activity, DetailInfoCovidActivity::class.java)
                moveToDetailInfoCovid.putExtra(EXTRA_INFO, infoCovid)
                activity.startActivity(moveToDetailInfoCovid)
            }
        }
    }
}