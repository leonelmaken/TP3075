package com.momo.momo.service.api;

import java.util.List;

import com.momo.momo.entities.Transaction;

public interface ComptStructureService {
	 List<Transaction> getAllDepots();
	 List<Transaction> getAllRetrait();
}
