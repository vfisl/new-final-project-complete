package com.vfislk.training.service;

import java.util.List;

import com.vfislk.training.exceptions.CustomerNotFoundExcepion;
import com.vfislk.training.model.Customer;
import com.vfislk.training.model.Occupation;

public interface ICustomerService {

	Customer addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(int customerId);

	Customer getById(int customerId) throws CustomerNotFoundExcepion;

	List<Customer> customersList();

	List<Customer> getByNomineeName(String nomineeName) throws CustomerNotFoundExcepion;

	List<Customer> getByPhoneNumber(long phoneNumber) throws CustomerNotFoundExcepion;

	List<Customer> getByOccupation(Occupation occupation) throws CustomerNotFoundExcepion;

	List<Customer> getByCustomerAge(int customerAge) throws CustomerNotFoundExcepion;

}
