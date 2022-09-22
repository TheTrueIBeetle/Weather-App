/**
 * Project Name: Weatherman
 * File Name: ApiUtilities.kt
 * Author: Luke Bas
 * Date Created: 2022-06-28
 * Context: ApiUtilities object holding utils
 */

package com.example.weatherman.Utilities

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilities {

    private var retrofit: Retrofit? = null;
    var BASE_URL = "http://api.openweathermap.org/data/3.0/";

    fun getApiInterface(): IWeather? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit!!.create(IWeather::class.java);
    }

}