package com.practice.fluxdemo.service;

import com.practice.fluxdemo.domain.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Flux<Customer> findAllCustomers();

    Mono<Customer> saveCustomerDetaisl(Customer customer);
}
