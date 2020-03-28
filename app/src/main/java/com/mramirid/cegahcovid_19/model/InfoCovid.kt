package com.mramirid.cegahcovid_19.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class InfoCovid(
    var id: Int,
    var title: String,
    var description: String,
    var icon: Int,
    var image: Int
) : Parcelable