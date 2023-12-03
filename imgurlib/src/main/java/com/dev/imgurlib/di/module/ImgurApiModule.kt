package com.dev.imgurlib.di.module

import com.dev.imgurlib.interceptors.AuthInterceptor
import com.dev.imgurlib.interfaces.ImgurAPI
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.net.HttpURLConnection
import javax.inject.Singleton

@Module
class ImgurApiModule {

    @Provides
    fun provideOkHttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .addNetworkInterceptor(AuthInterceptor())
            .build()
    }

    @Provides
    fun provideRetrofit(okHttpClient:OkHttpClient): Retrofit {//
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.imgur.com/3")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Provides
    fun provideImgurApi(retrofit: Retrofit): ImgurAPI {
        return retrofit.create(ImgurAPI::class.java)
    }
}