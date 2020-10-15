package com.yendu.daggerpractice3.di

import com.yendu.daggerpractice3.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create():LoginComponent
    }
    fun inject(loginActivity: LoginActivity);
}