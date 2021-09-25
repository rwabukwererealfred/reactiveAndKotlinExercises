package com.exercise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories
import reactor.core.publisher.Flux

@SpringBootApplication
//@EnableJdbcRepositories
open class ExerciseApplication

fun main(args: Array<String>) {
	runApplication<ExerciseApplication>(*args)

}
