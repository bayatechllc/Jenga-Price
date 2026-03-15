package com.jengaafrica.price

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform