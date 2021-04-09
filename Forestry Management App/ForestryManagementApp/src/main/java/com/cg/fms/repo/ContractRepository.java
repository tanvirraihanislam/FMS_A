package com.cg.fms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.dto.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
