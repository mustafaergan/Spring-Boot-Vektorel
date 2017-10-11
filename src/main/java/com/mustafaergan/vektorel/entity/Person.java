package com.mustafaergan.vektorel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;

}
