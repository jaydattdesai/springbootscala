package com.learnings.springbootscala.service.impl

import java.util.Optional

import com.learnings.springbootscala.entity.Person
import com.learnings.springbootscala.repository.PersonRepository
import com.learnings.springbootscala.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import scala.collection.JavaConverters._


@Service
class PersonServiceImpl @Autowired()(private val personRepository: PersonRepository)
  extends  PersonService{

  override def getPersons: List[Person] = {

    val persons = personRepository.findAll()

    val personList = asScalaIterator(persons.iterator()).toList

//    personList.foreach(person => println(person.getId))
    personList

  }

  override def createPerson(person: Person): Person = {
    println(person.firstName)
    personRepository.save(person)
  }

  override def getPerson(id: String): Optional[Person] ={
    personRepository.findById(id)
  }

  override def deletePerson(id: String): String ={
    personRepository.deleteById(id)
    s"Person with id=$id deleted successfully"
  }
}
