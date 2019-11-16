package com.demoproject.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "USER", schema = "PROJECTSCHEMA")
public class User implements Serializable {

	private static final long serialVersionUID = 2540104480968021560L;
	@Id
	@Column(name = "USER_ID")
	private Long id;
	@Column(name = "PASS_WD")
	private String password;
	@Column(name = "FNAME")
	private String firstName;
	@Column(name = "LNAME")
	private String lastName;
	@Temporal(TemporalType.DATE)
	@Column(name = "DOB")
	private Date dob;
	@CreationTimestamp
	@Column(name = "REG_DT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;
	@CreationTimestamp
	@Column(name = "ENROLL_DT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date enrollDate;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "PINCODE")
	private int pincode;
	@Column(name = "ADDRESS")
	private String address;
	@UpdateTimestamp
	@Column(name = "UPDT_DT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt=new Date();
	@Column(name = "UPDT_BY")
	private String updatedBy;
	@CreationTimestamp
	@Column(name = "CREATED_DT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt=new Date();
	@Column(name = "CREATED_BY")
	private String createdBy;

	// setter&getter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	@PreUpdate
	public void setUpdatedAt() {
		this.updatedAt = new Date();
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	
	public void setCreatedAt(Date date) {
		this.createdAt = date;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public User(Long id, String password, String firstName, String lastName, Date dob, Date regDate, Date enrollDate,
			String location, int pincode, String address, Date updatedAt, String updatedBy, Date createdAt,
			String createdBy) {
		super();
		this.id = id;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.regDate = regDate;
		this.enrollDate = enrollDate;
		this.location = location;
		this.pincode = pincode;
		this.address = address;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

}
