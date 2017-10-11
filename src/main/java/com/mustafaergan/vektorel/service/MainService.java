package com.mustafaergan.vektorel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafaergan.vektorel.dao.PersonDao;
import com.mustafaergan.vektorel.entity.Person;

@Service
public class MainService {
	
	@Autowired
	StringService stringService;
	
	@Autowired
	PersonDao personDao;
	
	public int topla(int a, int b) {
		return a+b;
	}
	
	public String bol(String veri, int bolum){
		return veri.substring(0, bolum);
	}
	
	public void veriEkle(){
		Person person = new Person();
		person.setName("mustafa");
		personDao.save(person);
	}
	
	public void veriEkle(String veri){
		Person person = new Person();
		person.setName(veri);
		personDao.save(person);
	}
	
	public String veriGetir(int number){
		Person person = personDao.findOne(number);
		return person.getName();
	}
	
	public void getAllData(){
		List<Person> person = (List<Person>) personDao.findAll();
	}
}
