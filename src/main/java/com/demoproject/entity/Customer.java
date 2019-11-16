package com.demoproject.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer")	
public class Customer {
	
	@EmbeddedId
	private CustomerId id;
	@Column(name="age")
	private int age;
	@Column(name="name")
	private String name;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(CustomerId id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public CustomerId getId() {
		return id;
	}

	public void setId(CustomerId id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
