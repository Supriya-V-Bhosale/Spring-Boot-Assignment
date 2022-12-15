package com.nissan.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.ICutomerDAO;
import com.nissan.model.Customer;

@Service
public class CustomerServerImplemention implements ICustomerService {
	@Autowired 
	ICutomerDAO customerDAO;
	@Override
	public List<Customer> listAllCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.findAll();
	}

	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.save(customer);
	}

	
	@Override
	public Optional<Customer> searchById(Integer id) {
		Optional<Customer>  customer=customerDAO.findById(id);
		Customer p=customer.get();
		 if(p!=null) {
			 return customer;
		 }
		 else
		 {
			 return null;
		 }
	}

	@Override
	public void deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		customerDAO.deleteById(id);

	}

	@Override
	public Customer updateCustomerById(Customer customer, Integer id) {
		// TODO Auto-generated method stub
		return customerDAO.save(customer);
	}

}
