package com.pktech.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pktech.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	

}
