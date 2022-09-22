/**
 * Project Name: Weatherman
 * File Name: ModelClass.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: Weather model class
 */

package com.example.weatherman.POJO

import com.google.gson.annotations.SerializedName

data class ModelClass (
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("main") val main: Main,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)