package com.falon.survey.login.presentation.auth

import com.falon.survey.login.presentation.model.GoogleAccount

expect class GoogleAuthUiProvider {
    suspend fun signIn(): GoogleAccount?
}
