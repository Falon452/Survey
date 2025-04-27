package com.falon.survey.splash.effect

sealed interface SplashEffect {

    data object SignIn : SplashEffect
    data object RouteToHabits : SplashEffect
}
