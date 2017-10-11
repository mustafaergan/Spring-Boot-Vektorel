package com.mustafaergan.vektorel.dao;

import org.springframework.data.repository.CrudRepository;

import com.mustafaergan.vektorel.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {

}
