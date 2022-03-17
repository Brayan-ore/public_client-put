package com.bootcamp.public_servicedebit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.public_servicedebit.model.dao.Debit;
import com.bootcamp.public_servicedebit.service.DebitService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/debit")
@RequiredArgsConstructor
public class DebitController {

    @Autowired //ADDED
    private DebitService service;
	
	@GetMapping
    public Flux<Debit> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Debit> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Debit> save(@RequestBody Debit debit) {
        return service.save(debit);
    }

    @PutMapping
    public Mono<Debit> put(@RequestBody Debit debit) {
        return service.save(debit);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }
	
}
