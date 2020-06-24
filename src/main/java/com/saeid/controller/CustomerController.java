package com.saeid.controller;

import com.saeid.model.Customer;
import com.saeid.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer/{id}")
    @ResponseBody
    public Customer getCustomerById(@PathVariable("id") int id){
        Customer customer = customerService.findCustomerById(id);
        return customer;
    }
}
