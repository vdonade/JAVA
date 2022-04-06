package com.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicine.model.User;

public interface RegistrationRepo extends JpaRepository<User, Integer>{

	public User findByEmailId(String email);
	
	public User findByEmailIdAndPassword(String email, String password);
}
