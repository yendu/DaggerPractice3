package com.yendu.daggerpractice3

import com.yendu.daggerpractice3.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(userRepository: UserRepository){

}