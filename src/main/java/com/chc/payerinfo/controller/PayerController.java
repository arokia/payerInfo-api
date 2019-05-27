package com.chc.payerinfo.controller;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chc.payerinfo.model.Payer;
import com.chc.payerinfo.service.PayerService;
import com.chc.payerinfo.util.SequenceGenerator;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:5000" })
@RequestMapping("api/v1/payer")
public class PayerController {
	
	@Autowired	
	private final PayerService payerService;
	private SequenceGenerator idGenerator = new SequenceGenerator();
	
	public PayerController(PayerService payerService) {
		this.payerService = payerService;
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Void>  addPayer(@RequestBody Payer payer) {		
		payer.setId(Long.toString(idGenerator.nextId()));
		payerService.insertPayer(payer);
		try {
			return ResponseEntity.created(new URI("/"+payer.getId())).build();
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	@GetMapping
	public List<Payer> getAllPayers(){
		return payerService.selectAllPayers();
	}
	
	@GetMapping(path = "{id}")
	public Payer getPayerById(@PathVariable("id") String id) {
		return payerService.selectPayerById(id)
				 .orElse(null);
	}
	
}
