package com.example.recyclerview.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemModel(val image : Int,
                     val description: String,
                     val longText: String): Parcelable
