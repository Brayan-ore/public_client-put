package com.bootcamp.public_servicedebit.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.public_servicedebit.model.dao.Debit;


public interface DebitCrudRepository extends ReactiveCrudRepository<Debit, String>{

}
