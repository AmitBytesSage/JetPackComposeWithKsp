package com.dev.thoughtctl

import android.app.Application
import com.dev.imgurlib.di.module.ImgurApiModule
import com.dev.thoughtctl.di.components.DaggerAppComponent

class MyApp : Application(){

    val appComponent = DaggerAppComponent.builder()
        .imgurApiModule(ImgurApiModule())
        .build()

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)
    }
//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = appComponent
}