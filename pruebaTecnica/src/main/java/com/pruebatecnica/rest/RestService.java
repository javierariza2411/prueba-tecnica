package com.pruebatecnica.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.entity.Person;
import com.pruebatecnica.idao.IPersonService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/restService")
public class RestService {
	
	@Autowired
	private IPersonService personService;
	
//	Metodo utilizado para obtener listado de Personas

	
	@GetMapping(path="/getPerson", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Person> getData() {
		
		return personService.getPerson();		
	}
	
	
//	Metodo utilizado para Registrar Persona

	
	@PostMapping(path="/registerPerson", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Person> saveData(@RequestBody Person person) {
		
		
		 personService.registerPerson(person);	
		 
		 return new ResponseEntity<Person>(person,HttpStatus.OK);
	}
	
	
	
	
//	Metodo utilizado para Procesar Persona
	
	@PostMapping(path="/indictedPerson", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Person> editData(@RequestBody Person person) {
		
		
		 personService.indictedPerson(person);	
		 
		 return new ResponseEntity<Person>(person,HttpStatus.OK);
	}
	
	
	

}
