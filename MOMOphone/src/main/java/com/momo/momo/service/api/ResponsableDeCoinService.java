package com.momo.momo.service.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.Compte;
import com.momo.momo.entities.ResponsableDeCoin;
import com.momo.momo.entities.Transaction;

public interface ResponsableDeCoinService {
	   ResponseEntity<String> saveRespon(ResponsableDeCoin responD);
	   ResponseEntity<String> updateRespon(ResponsableDeCoin responD,Long id);
	   String deleteResponById(Long id);
	   ResponsableDeCoin getRespon(Long id);
	   List<ResponsableDeCoin> getAllResponsD();
	   Compte ConsulterSolde(Compte compte);
	   Transaction Depot(Transaction transaction);
	   Transaction saveRetrait(Transaction transaction);
	   
}
