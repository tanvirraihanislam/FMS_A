package com.cg.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cg.fms.dao.ContractDao;
import com.cg.fms.dto.Contract;
import com.cg.fms.repo.ContractRepository;

public class ContractServiceImpl implements ContractService {
	
	@Autowired
	@Qualifier("ContractDaoImpl")
	ContractDao contdao;
	
	@Override
	public Contract getContract(Integer contractNumber) {
		
		return contdao.getContract(contractNumber);
		
		
	}
	
	
}
