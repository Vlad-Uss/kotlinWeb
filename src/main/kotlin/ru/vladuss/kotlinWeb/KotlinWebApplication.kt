package ru.vladuss.kotlinWeb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinWebApplication

fun main(args: Array<String>) {

	runApplication<KotlinWebApplication>(*args)
}
