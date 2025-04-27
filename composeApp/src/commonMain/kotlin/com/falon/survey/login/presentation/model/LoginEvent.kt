package com.falon.survey.login.presentation.model

sealed interface LoginEvent {

    data object NavigateToMainScreen : LoginEvent
    data object NavigateToRegister : LoginEvent
}
