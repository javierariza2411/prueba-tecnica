package com.pruebatecnica.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.crud.IPersonDao;
import com.pruebatecnica.entity.Person;
import com.pruebatecnica.idao.IPersonService;

@Service
public class PersonImpl implements IPersonService {




	@Autowired
	private IPersonDao personDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */
	public List<Person> getPerson() {
		return (List<Person>) personDao.findAll();
	}
	
	
//	Metodo utilizado para Registrar Person
	
	
	public void registerPerson(Person person) {
		
		personDao.save(person);
	}
	
	
//	Metodo utilizado para Procesar Persona
	
	public void indictedPerson(Person person) {
		person.setIndicted(true);
		personDao.save(person);

		
	}
	
}