package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.Customer;

public interface ICustomerService {
	List<Customer> listAllCustomer();
	
	Customer addCustomer(Customer customer);

	Optional<Customer> searchById(Integer id);
	
	void deleteCustomerById(Integer id);
	
	Customer updateCustomerById(Customer customer,Integer id);
}
