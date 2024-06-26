package com.example.dogbreed.api

import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Defaul RetrofitInstance code
object RetrofitInstance {

    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    private val converter = GsonConverterFactory.create()
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(ApiDetail.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(converter)
        .build()

    val apiClient = retrofit.create(ApiEndpoints::class.java)

}