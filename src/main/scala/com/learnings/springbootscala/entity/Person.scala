package com.learnings.springbootscala.entity

import javax.persistence.{Column, Entity, GeneratedValue, GenerationType, Id}


@Entity
class Person() {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private var id: String = null

  @Column
  var firstName: String = null

  def setId(id: String) = {
    this.id = id
  }

  def getId = {
    this.id
  }

  def setFirstName(firstName: String): Unit = {
    this.firstName = firstName
  }
  def getFirstName = {
    firstName
  }
}