package com.falon.survey.survey.presentation.model

sealed interface HabitsEffect {

    data object RequestFocusOnNewHabit : HabitsEffect

    data object HideKeyboard : HabitsEffect

    data class ShowToast(val text: String) : HabitsEffect
}
