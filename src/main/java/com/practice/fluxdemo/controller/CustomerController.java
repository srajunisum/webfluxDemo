package com.practice.fluxdemo.controller;

import com.practice.fluxdemo.domain.Customer;
import com.practice.fluxdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    @RequestMapping("hi")
    public String getMessage(){

        return "Hello";
    }

    @GetMapping
    public Flux<Customer> findAllCustomer(){

       return customerService.findAllCustomers();
    }

    @PostMapping
    public Mono<Customer> saveCustomerDetails(@RequestBody Customer customer){

        return customerService.saveCustomerDetaisl(customer);
    }


}
