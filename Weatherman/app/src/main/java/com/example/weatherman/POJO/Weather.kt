/**
 * Project Name: Weatherman
 * File Name: Weather.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: Weather props
 */

package com.example.weatherman.POJO

import com.google.gson.annotations.SerializedName

data class Weather (
    @SerializedName("id") val id:Int,
    @SerializedName("main") val main:String,
    @SerializedName("description") val description:String,
    @SerializedName("icon") val icon:String

)