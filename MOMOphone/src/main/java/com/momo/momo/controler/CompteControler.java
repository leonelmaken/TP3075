package com.momo.momo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.momo.entities.Compte;
import com.momo.momo.service.api.CompteService;

@RestController
@RequestMapping(path="/Compte") 
public class CompteControler {
  
	@Autowired
	CompteService compteService;
	
	@PostMapping(path="/create")
	public ResponseEntity<String> create(@RequestBody Compte compte) {
		return compteService.saveCompte(compte);	
	}
	
	@GetMapping(path="/read")
	public List<Compte>  read(){
		return compteService.getAllComptes();
		
	}
	
	@GetMapping(path="/readCompteId/{id}")
	public Compte  readCompteId(@PathVariable Long id){
		return compteService.getCompte(id);	
	}
	@PutMapping(path="/update/{id}")
	public ResponseEntity<String> update(@RequestBody Compte compte,Double Solde) {
		return compteService.updateCompte(compte,Solde);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String delete(@PathVariable Long id) {
		return compteService.deleteCompteById(id);
	}
	
	@DeleteMapping(path="/deleteCompte")
	public String deleteCompte(Compte compt) {
		return compteService.deleteCompte(compt);
	}
}
