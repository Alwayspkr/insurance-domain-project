package com.pktech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.pktech.repository.CustomerRepository;
import com.pktech.exception.ResourceNotFoundException;

import com.pktech.model.*;

@RestController
@RequestMapping("api/v1/")
public class CustomerController{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
		
	}
	
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);	
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
		Customer customer = customerRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(customer);	
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customerDetails){
		Customer customer = customerRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not exist with id :" + id));
		customer.setFirstName(customerDetails.getFirstName());
		customer.setSecondName(customerDetails.getSecondName());
		customer.setEmailId(customerDetails.getEmailId());
		customer.setPhoneNumber(customerDetails.getPhoneNumber());
		customer.setAddress(customerDetails.getAddress());
		customer.setPinCode(customerDetails.getPinCode());
		
		Customer updateCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(updateCustomer);
	}
 	

	
	
	
	
	

}
