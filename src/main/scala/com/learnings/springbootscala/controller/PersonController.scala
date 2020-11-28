package com.learnings.springbootscala.controller

import java.util.Optional

import com.learnings.springbootscala.entity.Person
import com.learnings.springbootscala.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{DeleteMapping, GetMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(Array("persons"))
class PersonController @Autowired() (private val personService: PersonService) {

  @GetMapping
  def getPersons: List[Person] = {
    personService.getPersons
  }

  @GetMapping(Array("{id}"))
  def getPerson(@PathVariable("id") id: String) = {
    personService.getPerson(id)
  }

  @DeleteMapping(Array("{id}"))
  def deletePerson(@PathVariable("id") id: String): String = {
    personService.deletePerson(id)
  }

  @PostMapping
  def createPerson (@RequestBody person: Person): Person = {
    personService.createPerson(person)
  }

}
