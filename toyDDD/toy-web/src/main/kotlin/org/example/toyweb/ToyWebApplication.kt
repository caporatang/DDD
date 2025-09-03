package org.example.toyweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToyWebApplication

fun main(args: Array<String>) {
    runApplication<ToyWebApplication>(*args)
}
