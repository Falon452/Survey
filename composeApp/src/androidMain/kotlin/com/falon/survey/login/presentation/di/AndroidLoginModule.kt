package com.falon.survey.login.presentation.di

import androidx.credentials.CredentialManager
import com.falon.survey.login.presentation.auth.GoogleAuthProvider
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module


actual val loginPlatformModule: Module = module {
    factory { CredentialManager.create(androidContext()) } bind CredentialManager::class
    factoryOf(::GoogleAuthProvider) bind GoogleAuthProvider::class
}
