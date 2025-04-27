package com.falon.survey.survey.data.di

import com.falon.survey.survey.data.FirestoreHabitsRepository
import com.falon.survey.survey.data.mapper.HabitDataMapper
import com.falon.survey.survey.domain.repository.HabitsRepository
import com.falon.survey.survey.domain.specification.HabitDisabledSpec
import com.falon.survey.survey.domain.usecase.CreateHabitUseCase
import com.falon.survey.survey.domain.usecase.IncreaseHabitStreakUseCase
import com.falon.survey.survey.domain.usecase.ObserveHabitsUseCase
import com.falon.survey.survey.domain.usecase.ShareHabitWithUseCase
import com.falon.survey.survey.presentation.mapper.HabitItemMapper
import com.falon.survey.survey.presentation.mapper.HabitsViewStateMapper
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val habitsDataModule = module {
    factory { HabitDisabledSpec(clock = Clock.System, timeZone = TimeZone.currentSystemDefault()) }
    factory { HabitDataMapper(get(), timeZone = TimeZone.currentSystemDefault()) }
    singleOf(::FirestoreHabitsRepository) { bind<HabitsRepository>() }
    factoryOf(::IncreaseHabitStreakUseCase)
    factoryOf(::ShareHabitWithUseCase)
    factoryOf(::ObserveHabitsUseCase)
    factoryOf(::CreateHabitUseCase)
    factoryOf(::HabitsViewStateMapper)
    factoryOf(::HabitItemMapper)
}
