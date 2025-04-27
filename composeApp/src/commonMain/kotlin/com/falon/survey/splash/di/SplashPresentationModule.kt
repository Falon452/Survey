package com.falon.survey.splash.di

import com.falon.survey.splash.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val splashPresentationModule = module {
    viewModelOf(::SplashViewModel)
}
