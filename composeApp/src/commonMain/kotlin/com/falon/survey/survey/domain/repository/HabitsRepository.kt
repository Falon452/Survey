package com.falon.survey.survey.domain.repository

import com.falon.survey.survey.domain.model.DomainError
import com.falon.survey.survey.domain.model.Habit
import com.github.michaelbull.result.Result
import kotlinx.coroutines.flow.Flow

interface HabitsRepository {

    fun observeHabits(): Flow<List<Result<Habit, DomainError>>>

    suspend fun insertHabit(habit: Habit): Result<Unit, DomainError.DatabaseError>

    suspend fun replaceHabit(habit: Habit): Result<Unit, DomainError.DatabaseError>

    suspend fun getHabit(id: String): Result<Habit, DomainError>
}
