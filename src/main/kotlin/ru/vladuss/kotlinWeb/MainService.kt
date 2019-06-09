package ru.vladuss.kotlinWeb

import org.springframework.stereotype.Service

@Service
class MainService {

    fun getHello(): String {
        return "hello service"
    }
}