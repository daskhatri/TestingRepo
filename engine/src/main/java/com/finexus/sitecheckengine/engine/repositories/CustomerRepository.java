package com.finexus.sitecheckengine.engine.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.finexus.sitecheckengine.engine.pojo.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
