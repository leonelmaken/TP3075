package com.TPINFO3075.demo.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.UserService;
import lombok.AllArgsConstructor;
import modele.Compte;

@RestController
@AllArgsConstructor
public class AppPhoneControler {
private final UserService user = new UserService();
   
   @PostMapping("/create")
   public ResponseEntity<String> create(@RequestBody Compte compte) {
	return user.CréerCompt(compte);
	   	
   }
  @PutMapping(value="/update/{idUser}")
   public ResponseEntity<String> update(@PathVariable long idUser,Compte compte) {   
	return user.ModifierInfo(idUser, compte);
   }
   @DeleteMapping(value="/delete")
   public String delete(@PathVariable long idUser,String CodePin) {
	return user.SupprimerCompt(idUser, CodePin);
   }
   
}
