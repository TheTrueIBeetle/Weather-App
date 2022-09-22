/**
 * Project Name: Weatherman
 * File Name: Main.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: "Main" model holding many props that will be retrieved from open-weather api
 */

package com.example.weatherman.POJO

import com.google.gson.annotations.SerializedName

data class Main (
    @SerializedName("temp") val temp: Double,
    @SerializedName("feels_like") val feels_like: Double,
    @SerializedName("temp_min") val temp_min: Double,
    @SerializedName("temp_max") val temp_max: Double,
    @SerializedName("pressure") val pressure: Int,
    @SerializedName("humidity") val humidity: Int,
)
