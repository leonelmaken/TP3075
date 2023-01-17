package com.momo.momo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.momo.entities.Transaction;
import com.momo.momo.repos.ComptStructureRepo;
import com.momo.momo.repos.TransactionRepos;
import com.momo.momo.service.api.ComptStructureService;

@Service
public class ComptStructureServiceImpl implements ComptStructureService{
	
	@Autowired
	ComptStructureRepo comptStructureRepo;

	@Autowired
    TransactionRepos transactionRepo;
	
	@Override
	public List<Transaction> getAllDepots() {
		// TODO Auto-generated method stub
		return transactionRepo.findAll();
	}

	@Override
	public List<Transaction> getAllRetrait() {
		// TODO Auto-generated method stub
		return transactionRepo.findAll();
	}
    
}
