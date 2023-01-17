package com.momo.momo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.momo.momo.entities.Compte;
import com.momo.momo.entities.Transaction;
import com.momo.momo.repos.CompteRepository;
import com.momo.momo.repos.TransactionRepos;
import com.momo.momo.service.api.CompteService;
import com.momo.momo.service.api.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionRepos transactionRepos;
	
	@Autowired 
	CompteRepository compteRepository;
	
	@Autowired
	CompteService compteService;
	
	@Override
	public ResponseEntity<String> saveDepot(Transaction transaction) {
		try {
			if (transaction.getDepot().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer le montant ! ", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (transaction.getUser().getNumeroTel() == 0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer un  Numéro de téléphone", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
			 transactionRepos.save(transaction);
			   return new ResponseEntity<>(
					      "Vous avez éffectué un dépos de : " + transaction.getDepot() + "Au numéro : " + transaction.getNumeroTel() +" à " +
			   transaction.getUser().getUsername() + "le " + transaction.getDate(), 
					      HttpStatus.OK);	
		}catch(Exception e) {
			return new ResponseEntity<>(
				      "Erreur 500",HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}

	@Override
	public ResponseEntity<String> saveRetrait(Transaction transaction) {
		Compte compte = new Compte();
		try {
			if (transaction.getRetrait().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer le montant à retirer ! ", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (transaction.getUser().getNumeroTel() == 0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer un  Numéro de téléphone", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
			if(transaction.getRetrait() > compte.getSolde() ) {
				
				return new ResponseEntity<>(
				          "Vous ne pouvez pas éffectuer se retrait Solde insufisante", 
				          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
			}
			else if(transaction.getRetrait()<= 1000 && transaction.getRetrait() > 0)
			{
				Double Solde = transaction.getRetrait()+50;
				compteService.updateCompte(compte, compte.getSolde()-Solde);
			}
			else
			{
				compteService.updateCompte(compte,compte.getSolde() - transaction.getRetrait()+100);
			}
			 transactionRepos.save(transaction);
			   return new ResponseEntity<>(
					      "Vous avez éffectué un dépos de : " + transaction.getDepot() + "Au numéro : " + transaction.getNumeroTel() +" à " +
			   transaction.getUser().getUsername() + "le " + transaction.getDate(), 
					      HttpStatus.OK);	
		}catch(Exception e) {
			return new ResponseEntity<>(
				      "Erreur 500",HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}

	@Override
	public Transaction getTransaction(Long id) {
           
		return transactionRepos.findById(id).get();
	}

	@Override
	public Transaction getTransactionByNumber(int NumeroTel) {
		// TODO Auto-generated method stub
		return transactionRepos.findByNumeroTel(NumeroTel);
	}

	@Override
	public Transaction getTransactionByDate(Date date) {
		// TODO Auto-generated method stub
		return transactionRepos.findByDate(date);
	}

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return transactionRepos.findAll();
	}


}
