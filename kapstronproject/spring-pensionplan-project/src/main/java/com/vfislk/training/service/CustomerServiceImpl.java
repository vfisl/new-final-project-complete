package com.vfislk.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfislk.training.exceptions.CustomerNotFoundExcepion;
import com.vfislk.training.model.Customer;
import com.vfislk.training.model.Occupation;
import com.vfislk.training.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	ICustomerRepository customerRepository;

	@Autowired
	public void setCustomerRepository(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer getById(int customerId) throws CustomerNotFoundExcepion {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customer> customersList() {
		return customerRepository.findAll();
	}


	@Override
	public List<Customer> getByNomineeName(String nomineeName) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByNomineeName(nomineeName);
	}

	@Override
	public List<Customer> getByPhoneNumber(long phoneNumber) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByPhoneNumber(phoneNumber);
	}

	@Override
	public List<Customer> getByOccupation(Occupation occupation) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByOccupation(occupation);
	}

	@Override
	public List<Customer> getByCustomerAge(int customerAge) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByCustomerAge(customerAge);
	}

}
