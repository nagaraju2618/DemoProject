package com.demoproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoproject.entity.User;

public interface UserRepo extends CrudRepository<User,Long> {
}
