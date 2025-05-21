package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Login;
import com.example.pojo.UserRegistration;
import com.example.repo.UserRegistrationRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRegistrationRepo userRegistrationRepo;

	
	
	public UserRegistration saveUser(UserRegistration userRegistration) {
		return userRegistrationRepo.save(userRegistration);
	}
	
	public Optional<UserRegistration> findUser(Long id) {
		Optional<UserRegistration> user = userRegistrationRepo.findById(id);
		return user;
	}
	
	public List<UserRegistration> findAllUser(){
	List<UserRegistration> user =	userRegistrationRepo.findAll();
	  return user;
	}
	
	public void deleteUser(Long id) {
		 userRegistrationRepo.deleteById(id);
	}
	
	public UserRegistration updateUser(Long id, UserRegistration userRegistration) {
	Optional<UserRegistration> user =	userRegistrationRepo.findById(id);
		if(user.isPresent()) {
		UserRegistration existing = user.get();
		existing.setName(userRegistration.getName());
		existing.setGender(userRegistration.getGender());
		existing.setEmail(userRegistration.getEmail());
		return userRegistrationRepo.save(existing );
	    
		} else {
			throw new RuntimeException("User not found with ID: " + id);
		}
	
	}
	
	  public boolean validateLogin(Login login) {
	        UserRegistration user = userRegistrationRepo.findByEmail(login.getEmail());
	        if (user != null && user.getPassword().equals(login.getPassword())) {
	            return true;
	        }
	        return false;
	    }
	  
	
}
