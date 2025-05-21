package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.UserRegistration;



public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Long>{
	UserRegistration findByEmail(String email);
	
}
