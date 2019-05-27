package com.chc.payerinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chc.payerinfo.model.Payer;
import com.chc.payerinfo.repository.PayerRepository;

@Service
public class PayerServiceImpl implements PayerService {
	
	@Autowired
	PayerRepository payerJpaRepository;
	
	@Override
	public void insertPayer(Payer payer) {	
		payerJpaRepository.save(payer);
	}

	@Override
	public List<Payer> selectAllPayers() {
		return (List<Payer>) payerJpaRepository.findAll();
	}

	@Override
	public Optional<Payer> selectPayerById(String id) {
		return payerJpaRepository.findById(id);
		
	}

	
}
