package com.demoproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ORDERS")
public class Orders {

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "PRICE")
	private double price;
	@CreationTimestamp
	@Column(name = "ORDEREDDATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderedDate = new Date();
	@ManyToOne
	@JoinColumn(name="UID")
    @JsonBackReference
	private User user;
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public Orders(Long id, String name, double price, Date orderedDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.orderedDate = orderedDate;
	}

	public Orders() {
		// TODO Auto-generated constructor stub
	}

}
