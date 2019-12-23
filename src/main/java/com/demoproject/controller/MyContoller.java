package com.demoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.entity.Orders;
import com.demoproject.entity.User;
import com.demoproject.repository.OrderRepo;
import com.demoproject.repository.UserRepo;
import com.demoproject.service.MyService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials= "true")
public class MyContoller {

	@Autowired
	private MyService service;

	@Autowired
	private UserRepo repo;

	@Autowired
	private OrderRepo orderRepo;

	@PostMapping(value = "/addUser")
	public User addUser(@RequestBody User u) {
		return service.addUser(u);
	}

	@PutMapping(value = "/updateUser")
	public User updateUserInfo(@RequestBody User u) {
		return repo.save(u);
	}

	@DeleteMapping(value = "/deleteUserById/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}

	@GetMapping(value = "/getUserInfo/{id}")
	public User getAllUserInfo(@PathVariable("id") Long id) {
		return repo.findById(id).get();
	}

	@GetMapping(value = "/getAllUsers")
	public Iterable<User> getAllUsers() {
		return repo.findAll();
	}

	@PostMapping(value = "/placeOrder")
	public Orders placeOrder(@RequestBody Orders o) {
		return orderRepo.save(o);
	}
	
	@GetMapping(value = "/getOrderById/{id}")
	public Orders getOrderById(@PathVariable("id") Long id) {
		return orderRepo.findById(id).get();
	}
	
	
	@GetMapping(value = "/getOrders")
	public Iterable<Orders> getOrders() {
		return orderRepo.findAll();
	}

}
