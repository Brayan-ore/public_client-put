package com.bootcamp.public_servicedebit.service;


import com.bootcamp.public_servicedebit.model.dao.Debit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DebitService {

	public Flux<Debit> findAll();
    public Mono<Debit> findById(String id);
    public Mono<Debit> save(Debit client);
    public Mono<Void> deleteById(String id);
	
}
