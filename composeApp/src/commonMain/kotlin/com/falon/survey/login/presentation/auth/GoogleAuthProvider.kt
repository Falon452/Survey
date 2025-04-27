package com.falon.survey.login.presentation.auth

import androidx.compose.runtime.Composable

expect class GoogleAuthProvider {

    @Composable
    fun getUiProvider(): GoogleAuthUiProvider
}
