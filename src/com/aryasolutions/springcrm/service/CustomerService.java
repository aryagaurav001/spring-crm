package com.aryasolutions.springcrm.service;

import java.util.List;

import com.aryasolutions.springcrm.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers(int theSortField);
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);

}
