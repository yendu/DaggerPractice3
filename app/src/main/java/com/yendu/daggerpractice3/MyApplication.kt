package com.yendu.daggerpractice3

import android.app.Application
import com.yendu.daggerpractice3.di.AppComponent
import com.yendu.daggerpractice3.di.DaggerAppComponent
import dagger.internal.DaggerCollections

class MyApplication:Application() {

//
    val appComponent:AppComponent by lazy {
         DaggerAppComponent.factory().create(this);
    }




}