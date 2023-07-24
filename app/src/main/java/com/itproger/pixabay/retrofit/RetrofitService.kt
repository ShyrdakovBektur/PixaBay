package com.itproger.pixabay.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private var retrofit: Retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()
    var api: PixaApi = retrofit.create(PixaApi::class.java)
}