package com.demoproject.dao;

import java.util.List;

import com.demoproject.entity.Customer;
import com.demoproject.entity.User;

public interface MyDao {

	Customer addEmp(Customer customer);

	List<Customer> getAllEmpInfo();

	User addUser(User user);


}
