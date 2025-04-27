package com.falon.survey.survey.presentation.di

import com.falon.survey.survey.presentation.viewmodel.HabitsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val habitsPresentationModule = module {
    viewModelOf(::HabitsViewModel)
}
