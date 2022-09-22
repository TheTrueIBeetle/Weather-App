/**
 * Project Name: Weatherman
 * File Name: IWeather.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: Interface for the open-weather api method templates
 */

package com.example.weatherman.Utilities

import com.example.weatherman.POJO.ModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeather {

    @GET("weather")
    fun getCurrentWeatherData (
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("APPID") api_key: String
    ): Call<ModelClass>

    @GET("weather")
    fun getCityWeatherData (
        @Query("q") cityName: String,
        @Query("APPID") api_key: String,
    ): Call<ModelClass>

}