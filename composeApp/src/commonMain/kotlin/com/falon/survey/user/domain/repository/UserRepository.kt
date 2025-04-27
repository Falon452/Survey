package com.falon.survey.user.domain.repository

import com.falon.survey.survey.domain.model.User

interface UserRepository {

    suspend fun getUser(email: String): User?

    suspend fun insertUser(user: User)

    fun getCurrentUser(): User?
}
