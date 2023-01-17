package com.momo.momo.repos;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.momo.momo.entities.Transaction;

public interface TransactionRepos extends JpaRepository<Transaction,Long>{

	Transaction findByNumeroTel(int numeroTel);
	Transaction findByDate(Date date);
}
