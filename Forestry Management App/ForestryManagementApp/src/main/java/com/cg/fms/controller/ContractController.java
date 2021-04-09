package com.cg.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.Contract;
import com.cg.fms.service.ContractService;

@RestController
@RequestMapping("contract")

public class ContractController {
	
	@Autowired
	ContractService contser;
	
	@GetMapping("{getContractDetils}")
	public ResponseEntity<?> getContract(@PathVariable("getContractDetils") Integer contractNumber){
		
		Contract c = contser.getContract(contractNumber);
		if(c == null) {
			return new ResponseEntity<String>("Contract details of " + contractNumber + " not found", HttpStatus.NOT_FOUND );
		}
		else {
			return new ResponseEntity<Contract>(c, HttpStatus.FOUND);
		}
	}
	
}
