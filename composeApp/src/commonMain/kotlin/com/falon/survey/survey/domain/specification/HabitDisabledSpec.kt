package com.falon.survey.survey.domain.specification

import kotlinx.datetime.*

class HabitDisabledSpec(
    private val clock: Clock,
    private val timeZone: TimeZone,
) {

    fun isMetBy(increaseUtcTimestamps: List<Long>): Boolean {
        if (increaseUtcTimestamps.isEmpty()) return false

        val latestIncreaseUtc = increaseUtcTimestamps.lastOrNull() ?: return false

        val latestIncreaseDateTime = Instant.fromEpochMilliseconds(latestIncreaseUtc)
            .toLocalDateTime(timeZone)

        val currentDate = clock.now().toLocalDateTime(timeZone).date

        return latestIncreaseDateTime.date == currentDate
    }
}
