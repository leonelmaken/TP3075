package com.momo.momo.service.api;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.Transaction;

public interface TransactionService {
	ResponseEntity<String> saveDepot(Transaction transaction);
	ResponseEntity<String> saveRetrait(Transaction transaction);
	Transaction getTransaction(Long id);
	Transaction getTransactionByNumber(int NumeroTel);
	Transaction getTransactionByDate(Date date);
	List<Transaction> getAllTransaction();
}
