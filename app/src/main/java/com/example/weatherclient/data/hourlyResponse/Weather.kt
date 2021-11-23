package com.example.weatherclient.data.hourlyResponse


import com.google.gson.annotations.SerializedName

data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)