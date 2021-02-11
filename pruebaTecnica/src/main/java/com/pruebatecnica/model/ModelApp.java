package com.pruebatecnica.model;

import java.io.Serializable;

public class ModelApp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8731473536637798552L;
	private Long id;
	private String Name;
	private String lastName;
	private boolean indicted;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isIndicted() {
		return indicted;
	}
	public void setIndicted(boolean indicted) {
		this.indicted = indicted;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
