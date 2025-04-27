package com.falon.survey

import com.falon.survey.login.presentation.di.loginModule
import com.falon.survey.login.presentation.di.loginPlatformModule
import com.falon.survey.splash.di.splashPresentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.includes

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        printLogger()
        includes(config)
        modules(
            loginPlatformModule,
            loginModule,
            splashPresentationModule,
        )
    }
}
