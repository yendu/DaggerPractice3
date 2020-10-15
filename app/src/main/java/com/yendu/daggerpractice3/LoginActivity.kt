package com.yendu.daggerpractice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yendu.daggerpractice3.di.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    lateinit var loginComponent:LoginComponent;

    @Inject
    lateinit var loginViewModel: LoginViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent=(application as MyApplication ).appComponent.loginComponent().create();


        loginComponent.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}