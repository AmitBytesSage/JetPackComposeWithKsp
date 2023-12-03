package com.dev.imgurlib

import com.dev.imgurlib.interceptors.AuthInterceptor
import com.dev.imgurlib.interfaces.ImgurAPI
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

public object Imgur {

    private val okHttp = OkHttpClient.Builder()
        .addNetworkInterceptor(AuthInterceptor())
        .build()

    private val retrofit = Retrofit.Builder()
        .client(okHttp)
        .baseUrl("https://api.imgur.com/3/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api = retrofit.create(ImgurAPI::class.java)
}