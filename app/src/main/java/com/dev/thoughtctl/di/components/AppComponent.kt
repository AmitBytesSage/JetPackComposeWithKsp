package com.dev.thoughtctl.di.components

import android.app.Application
import com.dev.imgurlib.di.module.ImgurApiModule
import com.dev.imgurlib.interfaces.ImgurAPI
import com.dev.thoughtctl.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [ImgurApiModule::class])
interface AppComponent  {

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        fun build(): AppComponent
//    }
     fun inject(application: Application)

    fun getImgurApi(): ImgurAPI
}