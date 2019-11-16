package com.demoproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demoproject.entity.Customer;
import com.demoproject.entity.User;
import com.demoproject.repository.CustomerRepo;
import com.demoproject.repository.UserRepo;

@Repository
public class DaoImpl implements MyDao {

	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private UserRepo userRepo;
	

	@Override
	public List<Customer> getAllEmpInfo() {
		// TODO Auto-generated method stub
		return (List<Customer>) repo.findAll();
	}

	@Override
	public Customer addEmp(Customer customer) {
		
		/*CustomerId cId=new CustomerId(994964642, "Hyd");
		Customer c=new Customer(cId, 26, "thiru");*/
		return repo.save(customer);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}


}
