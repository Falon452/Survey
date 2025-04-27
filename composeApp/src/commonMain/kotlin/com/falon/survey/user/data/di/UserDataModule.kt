package com.falon.survey.user.data.di

import com.falon.survey.user.data.repository.FirebaseUserRepository
import com.falon.survey.user.domain.repository.UserRepository
import com.falon.survey.user.domain.usecase.RegisterUserUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val userDataModule = module {
    singleOf(::FirebaseUserRepository) { bind<UserRepository>() }
    factoryOf(::RegisterUserUseCase)
}
