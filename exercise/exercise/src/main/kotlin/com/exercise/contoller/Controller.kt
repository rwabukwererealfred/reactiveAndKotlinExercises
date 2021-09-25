package com.exercise.contoller

import com.exercise.entity.Users
import com.exercise.repository.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@RestController
@RequestMapping("user/")
open class Controller() {

    @Autowired
    lateinit var repo:UserRepo

    @GetMapping("getWord")
    fun blog():ResponseEntity<String>{
        return ResponseEntity<String>("well received", HttpStatus.ACCEPTED);
    }

    @PostMapping("register", consumes = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody user:Users): Mono<Users> = repo.save(user);

    @GetMapping("getAll")
    fun findAll():Flux<Users>{
        return repo.findAll();
    }
    @GetMapping("{id}")
    fun findByIds(@PathVariable id:Integer):Mono<Users>{
        return repo.findById(id);
    }

    @DeleteMapping("deleteUser/{id}")
    fun deleteUser(@PathVariable id:Integer):Mono<Void>{
        return repo.deleteById(id);

    }
}


