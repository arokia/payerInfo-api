package com.chc.payerinfo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chc.payerinfo.model.Payer;

public interface PayerRepository extends MongoRepository<Payer, String> {

}
