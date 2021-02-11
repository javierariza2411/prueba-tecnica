package com.pruebatecnica.idao;

import java.util.List;

import com.pruebatecnica.entity.Person;

public interface IPersonService {

		public List<Person> getPerson();
		
		public void registerPerson(Person person);
		
		public void indictedPerson(Person person);
		
	}
