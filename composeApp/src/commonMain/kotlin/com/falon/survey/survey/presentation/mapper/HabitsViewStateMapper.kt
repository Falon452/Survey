package com.falon.survey.survey.presentation.mapper

import com.falon.survey.survey.presentation.model.HabitsState
import com.falon.survey.survey.presentation.model.HabitsViewState

class HabitsViewStateMapper(
    private val habitItemMapper: HabitItemMapper,
) {

    fun from(state: HabitsState) =
        with(state) {
            HabitsViewState(
                habits.map(habitItemMapper::from),
                isBottomDialogVisible,
                bottomDialogText,
                isShareHabitDialogVisible,
                shareHabitId,
            )
        }
}
