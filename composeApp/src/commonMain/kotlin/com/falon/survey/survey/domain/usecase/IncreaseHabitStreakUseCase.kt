package com.falon.survey.survey.domain.usecase

import com.falon.survey.survey.domain.model.DomainError
import com.falon.survey.survey.domain.repository.HabitsRepository
import com.github.michaelbull.result.Result
import com.github.michaelbull.result.asErr
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class IncreaseHabitStreakUseCase(
    private val habitsRepository: HabitsRepository,
) {

    suspend fun execute(id: String): Result<Unit, DomainError> {
        val habit = habitsRepository.getHabit(id)
        if (habit.isErr) {
            return habit.asErr()
        }

        val newStreak = habit.value.copy(
            streakDateTimes = habit.value.streakDateTimes.plus(
                Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
            )
        )

        return habitsRepository.replaceHabit(newStreak)
    }
}
