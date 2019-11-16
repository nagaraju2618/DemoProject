package com.demoproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoproject.entity.Customer;
import com.demoproject.entity.CustomerId;

public interface CustomerRepo extends CrudRepository<Customer,CustomerId> {
	

}
