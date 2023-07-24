package com.itproger.pixabay.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun getPictures(
        @Query("q") keyWord: String,
        @Query("key") key: String = "38400173-37bbe9b55689c9b3179569df6",
        @Query("per_page") pearPage: Int = 3,
        @Query("page") page: Int
    ): Call<PixaModel>
}