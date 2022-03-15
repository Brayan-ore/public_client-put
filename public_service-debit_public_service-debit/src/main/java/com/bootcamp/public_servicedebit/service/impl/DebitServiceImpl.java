package com.bootcamp.public_servicedebit.service.impl;

import com.bootcamp.public_servicedebit.model.dao.Debit;
import com.bootcamp.public_servicedebit.repository.DebitCrudRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class DebitServiceImpl {

private DebitCrudRepository repository;
	
	public Flux<Debit> findAll() {
        return repository.findAll();
    }

    public Mono<Debit> findById(String id) {
        return repository.findById(id);
    }

    public Mono<Debit> save(Debit debit) {
        return repository.save(debit);
    }

    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }
	
}
