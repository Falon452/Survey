package com.falon.survey.survey.presentation.model

data class HabitsViewState(
    val habitItems: List<HabitItem> = listOf(),
    val isBottomDialogVisible: Boolean = false,
    val bottomDialogText: String = "",
    val isShareHabitDialogVisible: Boolean = false,
    val shareHabitId: String? = null,
)
