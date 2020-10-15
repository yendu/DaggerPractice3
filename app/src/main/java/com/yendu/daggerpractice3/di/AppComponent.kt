package com.yendu.daggerpractice3.di

import android.content.Context
import com.yendu.daggerpractice3.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context:Context):AppComponent
    }

    fun loginComponent():LoginComponent.Factory;
    fun inject(mainActivity: MainActivity)

}