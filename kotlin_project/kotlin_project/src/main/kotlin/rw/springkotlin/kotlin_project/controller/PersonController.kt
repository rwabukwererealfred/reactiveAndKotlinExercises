package rw.springkotlin.kotlin_project.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import rw.springkotlin.kotlin_project.domain.Person
import rw.springkotlin.kotlin_project.repository.PersonRepository


@RestController
@RequestMapping("persons/")
class PersonController(private val personRepo: PersonRepository) {

    @GetMapping("{id}")
    fun findById(@PathVariable id:Int):Person? =personRepo.findById(id)

    @GetMapping
    fun findAll():MutableList<Person> {
       return personRepo.findAll()
    }


    @DeleteMapping("{id}")
    fun deletePerson(@PathVariable("id")id:Int) :ResponseEntity<String>{
       val person:Person? = personRepo.delete(id);
        person?.let {
            return ResponseEntity<String>("well successful deleted", HttpStatus.OK)
        }?: kotlin.run {
            return ResponseEntity<String>("ID NOT FOUND", HttpStatus.BAD_REQUEST)
        }

    }

    @PutMapping
    fun updatePerson(@RequestBody person:Person)=personRepo.update(person)

    @PostMapping
    fun addPerson(@RequestBody person: Person)= personRepo.add(person)

}