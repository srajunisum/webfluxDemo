package com.practice.fluxdemo.repository;

import com.practice.fluxdemo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer,Integer> {
}
