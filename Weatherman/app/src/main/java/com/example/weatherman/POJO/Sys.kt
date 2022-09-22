/**
 * Project Name: Weatherman
 * File Name: Sys.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: Sys props
 */

package com.example.weatherman.POJO

import com.google.gson.annotations.SerializedName

data class Sys (
    @SerializedName("type") val type: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("country") val country: String,
    @SerializedName("sunrise") val sunrise: Int,
    @SerializedName("sunset") val sunset: Int,
)
