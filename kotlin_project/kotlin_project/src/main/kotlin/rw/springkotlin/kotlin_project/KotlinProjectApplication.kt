package rw.springkotlin.kotlin_project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinProjectApplication

fun main(args: Array<String>) {
	runApplication<KotlinProjectApplication>(*args)
}
