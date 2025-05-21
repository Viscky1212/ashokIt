package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Login;
import com.example.pojo.Task;
import com.example.pojo.TaskRequest;
import com.example.pojo.UserRegistration;
import com.example.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
    public UserRegistration createUser(@RequestBody UserRegistration userRegistration) {
		return userService.saveUser(userRegistration);
    }
	
	@GetMapping("/user/{id}")
	public Optional<UserRegistration> searchUser(@PathVariable Long id){
		return userService.findUser(id);
	}
	
	@GetMapping("/user")
	public List<UserRegistration>  searchAll(){
		return userService.findAllUser();
	}
	  
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		return id + "Record deleted";
		
	}
	
//	@PutMapping("/update/{id}")
//	public UserRegistration updateUserDetails (@PathVariable Long id,@RequestBody UserRegistration userRegistration) {
//	UserRegistration updated = userService.updateUser(id, userRegistration);
//		return updated;
//	}
	
	 @PutMapping("/{id}")  // Final path: /user/{id}
	    public ResponseEntity<UserRegistration> updateUserDetails(
	            @PathVariable Long id,
	            @RequestBody UserRegistration userRegistration) {
	        UserRegistration updated = userService.updateUser(id, userRegistration);
	        return ResponseEntity.ok(updated);
	    }
	 
	  @PostMapping("  ")
	    public ResponseEntity<String> loginUser(@RequestBody Login login) {
	        boolean isValid = userService.validateLogin(login);
	        if (isValid) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.status(401).body("Invalid credentials");
	        }
	    }
	  
	
}
