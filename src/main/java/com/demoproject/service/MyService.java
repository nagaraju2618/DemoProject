package com.demoproject.service;

import java.util.List;

import com.demoproject.entity.Customer;
import com.demoproject.entity.User;

public interface MyService {

	Customer addEmp(Customer customer);
	List<Customer> getEmpInfo();
	User addUser(User user);
}
