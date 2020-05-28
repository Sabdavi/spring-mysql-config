package com.saeid.repository;

import com.saeid.model.Customer;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends Repository<Customer, Long> {
    List<Customer> findCustomerByName(String name);
}
