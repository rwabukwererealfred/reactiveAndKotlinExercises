package rw.springkotlin.kotlin_project.repository

import org.springframework.stereotype.Repository
import rw.springkotlin.kotlin_project.domain.Person

@Repository
class PersonRepository (private  val persons:MutableList<Person> = mutableListOf()){
    fun findById(id:Int):Person? =persons.find { it.id == id }
    fun findAll():MutableList<Person> = persons
    fun  delete(id:Int) :Person?{
        val person:Person? = findById(id);
        persons.removeIf{it.id ==person?.id}
        return person
    }
    fun add(person: Person) = persons.add(person)
    fun update(person: Person){
        val index:Int =persons.indexOfFirst { it.id == person.id }
        persons[index]=person
    }
}