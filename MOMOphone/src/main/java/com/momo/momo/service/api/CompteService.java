package com.momo.momo.service.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.Compte;

public interface CompteService {
   ResponseEntity<String> saveCompte(Compte compt);
   ResponseEntity<String> updateCompte(Compte compt,Double Solde);
   String deleteCompte(Compte compt);
   String deleteCompteById(Long id);
   Compte getCompte(Long id);
   List<Compte> getAllComptes();
}
