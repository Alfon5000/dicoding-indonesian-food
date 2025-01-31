package com.example.indonesianfood.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val name: String,
    val origin: String,
    val description: String,
    val photo: Int,
) : Parcelable
