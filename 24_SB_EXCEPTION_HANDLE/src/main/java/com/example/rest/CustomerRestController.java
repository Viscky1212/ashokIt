package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CustomerService;

@RestController
public class CustomerRestController {
	@Autowired
	private CustomerService customerService;
    @GetMapping("/customer/{customerID}")
	public String getCustomer(@PathVariable Integer customerID) throws Exception {
    	return customerService.getCustomerService(customerID);
    }
}
