package com.cg.fms.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.fms.dto.Contract;
import com.cg.fms.repo.ContractRepository;

@Component("ContractDaoImpl")
public class ContractDaoImpl implements ContractDao {
	
	@Autowired
	ContractRepository contractRepo;

	@Override
	public Contract getContract(Integer contractNumber) {
		
		if(contractRepo.existsById(contractNumber)) {
			Optional<Contract> ope = contractRepo.findById(contractNumber);
			
			if(ope.isPresent()) {
				Contract ct = ope.get();
				return ct;
			}
			
		}
		return null;
	}
	
	
}
