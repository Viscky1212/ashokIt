package com.example.service;

import org.springframework.stereotype.Service;

import com.example.exception.CustomerNotFoundException;

@Service
public class CustomerService {

	public String getCustomerService(Integer customerID) {
		if(customerID >= 100) {
    		return "John";
    	} else {
    		throw new CustomerNotFoundException("Invalid cusotmer Id");
    	}
	}
}
