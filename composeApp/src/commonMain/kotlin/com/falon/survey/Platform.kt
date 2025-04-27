package com.falon.survey

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform