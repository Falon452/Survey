package com.falon.survey.survey.presentation.mapper

import com.falon.survey.survey.domain.model.Habit
import com.falon.survey.survey.presentation.model.HabitItem

class HabitItemMapper {

    fun from(habit: Habit): HabitItem =
        with(habit) {
            HabitItem(
                id = id,
                name = name,
                numberOfDays = numberOfDays,
                isEnabled = !isDisabled,
            )
        }
}
