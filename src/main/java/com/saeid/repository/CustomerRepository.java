package com.saeid.repository;

import com.saeid.model.Customer;
import org.springframework.data.repository.Repository;
//import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository extends Repository<Customer, Long> {
    List<Customer> findCustomerByName(String name);
    Customer findCustomerById(int id);
}
