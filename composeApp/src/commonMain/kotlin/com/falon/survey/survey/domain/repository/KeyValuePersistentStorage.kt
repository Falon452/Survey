package com.falon.survey.survey.domain.repository

interface KeyValuePersistentStorage {

    fun update(key: String, value: Int)

    fun get(key: String, defaultValue: Int): Int
}
