package ru.vladuss.kotlinWeb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinWebApplication

fun main(args: Array<String>) {
	SpringApplication.run(KotlinWebApplication::class.java, *args)
}
