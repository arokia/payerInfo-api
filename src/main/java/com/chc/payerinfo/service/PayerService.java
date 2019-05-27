package com.chc.payerinfo.service;

import java.util.List;
import java.util.Optional;

import com.chc.payerinfo.model.Payer;

public interface PayerService {

	void insertPayer(Payer payer);
	
	List<Payer> selectAllPayers();
	
	Optional<Payer> selectPayerById(String id);
	
		
}
