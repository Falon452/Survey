package com.falon.survey.survey.domain.usecase

import com.falon.survey.survey.domain.model.DomainError
import com.falon.survey.survey.domain.model.Habit
import com.falon.survey.survey.domain.repository.HabitsRepository
import com.github.michaelbull.result.Result
import kotlinx.coroutines.flow.Flow

class ObserveHabitsUseCase(
    private val habitsRepository: HabitsRepository,
) {

    fun execute(): Flow<List<Result<Habit, DomainError>>> =
        habitsRepository.observeHabits()
}
