package com.learnings.springbootscala.service

import java.util.Optional

import com.learnings.springbootscala.entity.Person

trait PersonService {
  def getPersons: List[Person]

  def getPerson(id: String): Optional[Person]

  def deletePerson(id: String): String

  def createPerson(person: Person): Person
}
