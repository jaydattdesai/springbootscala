package com.learnings.springbootscala.repository

import com.learnings.springbootscala.entity.Person
import org.springframework.data.repository.CrudRepository

trait PersonRepository extends CrudRepository[Person, String]
