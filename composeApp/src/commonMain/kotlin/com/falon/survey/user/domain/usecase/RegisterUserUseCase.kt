package com.falon.survey.user.domain.usecase

import com.falon.survey.survey.domain.model.User
import com.falon.survey.user.domain.repository.UserRepository

class RegisterUserUseCase(
    private val userRepository: UserRepository,
) {

    suspend fun execute(user: User) =
        userRepository.insertUser(user)
}
