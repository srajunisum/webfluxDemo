package com.practice.fluxdemo.serviceimpl;

import com.practice.fluxdemo.domain.Customer;
import com.practice.fluxdemo.repository.CustomerRepository;
import com.practice.fluxdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Flux<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> saveCustomerDetaisl(Customer customer) {
        return customerRepository.save(customer);
    }
}
