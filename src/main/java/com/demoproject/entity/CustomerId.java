package com.demoproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CustomerId implements Serializable {


	
	private static final long serialVersionUID = 1L;
	@Column(name="mobileno")
	private long mobileno;
	@Column(name="location")
	private String location;

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public CustomerId() {
	}

	public CustomerId(long mobileno, String location) {
		super();
		this.mobileno = mobileno;
		this.location = location;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	

}
