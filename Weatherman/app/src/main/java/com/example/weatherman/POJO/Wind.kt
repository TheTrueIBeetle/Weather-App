/**
 * Project Name: Weatherman
 * File Name: Wind.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: Wind props
 */

package com.example.weatherman.POJO

import com.google.gson.annotations.SerializedName

data class Wind (
    @SerializedName("weather") val speed: Double,
    @SerializedName("main") val deg: Int,
)