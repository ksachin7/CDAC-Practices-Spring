package com.example.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// Derived query methods
	// here 'find' is called introducer and 'ByName' here is criteria
	public List<User> findByName(String name);
}
