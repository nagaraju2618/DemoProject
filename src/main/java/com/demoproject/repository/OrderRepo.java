package com.demoproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoproject.entity.Orders;

public interface OrderRepo extends CrudRepository<Orders, Long> {

}
