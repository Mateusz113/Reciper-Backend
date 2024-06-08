package com.mateusz113.reciper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ReciperBackendApplication

fun main(args: Array<String>) {
    runApplication<ReciperBackendApplication>(*args)
}

