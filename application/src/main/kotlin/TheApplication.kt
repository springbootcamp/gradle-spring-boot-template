package org.springbootcamp.template.gradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

fun main(args:Array<String>) = runApplication<TheApplication>(*args).let { Unit }

@SpringBootApplication
@RestController
class TheApplication {

  @GetMapping
  fun hello() = "hello Jan"

}



