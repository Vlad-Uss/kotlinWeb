package ru.vladuss.kotlinWeb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MainController(
        private val service: MainService){

    @GetMapping("/hello")
    fun helloKotlin(): String {
        return service.getHello()
    }

}