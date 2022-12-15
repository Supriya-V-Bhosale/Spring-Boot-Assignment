package com.nissan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;

import com.nissan.service.ICustomerService;

@RestController
@RequestMapping("api/")
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	
	@GetMapping("customers")
	public List<Customer> getAllEmployees() {
		return customerService.listAllCustomer();

	}
	
	@PostMapping("customers")
	public Customer inserEmployee(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("customers/{id}")
	public Optional<Customer> search(@PathVariable Integer id) {
		
		return customerService.searchById(id);
	}
	
	@DeleteMapping("customers/{id}")
	public void deletById(@PathVariable Integer id) {
		
		customerService.deleteCustomerById(id);
	}
	
	@PutMapping("customers/{id}")
	public Customer inserEmployeeById(@RequestBody Customer customer,Integer id) {
		// TODO Auto-generated method stub
		return customerService.updateCustomerById(customer, id);
	}
	
	

}
