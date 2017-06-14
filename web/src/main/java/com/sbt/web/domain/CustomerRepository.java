package com.sbt.web.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hehe on 2017/5/24.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long>{
    List<Customer> findByLastName(String lastName);
}
