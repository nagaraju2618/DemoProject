package com.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.dao.MyDao;
import com.demoproject.entity.Customer;
import com.demoproject.entity.User;

@Service
public class ServiceImpl implements MyService {

	@Autowired
	private MyDao dao;
	
	@Override
	public Customer addEmp(Customer customer) {
		return dao.addEmp(customer);
	}


	@Override
	public User addUser(User user) {
		return dao.addUser(user);
	}


	@Override
	public List<Customer> getEmpInfo() {
		// TODO Auto-generated method stub
		return dao.getAllEmpInfo();
	}

}
