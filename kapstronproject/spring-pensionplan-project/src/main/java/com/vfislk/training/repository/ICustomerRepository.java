package com.vfislk.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vfislk.training.exceptions.CustomerNotFoundExcepion;
import com.vfislk.training.model.Customer;
import com.vfislk.training.model.Occupation;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	// Derived Queries

	@Query("from Customer where phoneNumber=?1")
	List<Customer> findCustomerByPhoneNumber(long phoneNumber) throws CustomerNotFoundExcepion;

	@Query("from Customer where occupation=?1")
	List<Customer> findCustomerByOccupation(Occupation occupation) throws CustomerNotFoundExcepion;

	@Query("from Customer where customerAge=?1")
	List<Customer> findCustomerByCustomerAge(int customerAge) throws CustomerNotFoundExcepion;

	@Query("update Customer set phoneNumber=?1 where customerId=?2")
	void updateCustomer(long phoneNumber, int customerId);

	// Custom Queries

	@Query("from Customer c inner join c.nominees n where n.nomineeName=?1")
	List<Customer> findCustomerByNomineeName(String nomineeName) throws CustomerNotFoundExcepion;

}
