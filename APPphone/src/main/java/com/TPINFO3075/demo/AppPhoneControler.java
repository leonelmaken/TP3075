package com.TPINFO3075.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Service.api.AppPhone;
import modele.Compte;

@RestController
public class AppPhoneControler {

	private AppPhone appPhone;
   
   @PostMapping("/create")
   public ResponseEntity<Object> create(@RequestBody Compte compte) {
	   System.out.println("le compte : "+ compte);
	return appPhone.CréerCompt(compte);
	   	
   }
 /* @PutMapping(value="/update/{idappPhone}")
   public ResponseEntity<String> update(@PathVariable long idappPhone,Compte compte) {   
	return appPhone.ModifierInfo(idappPhone, compte);
   }
   @DeleteMapping(value="/delete")
   public String delete(@PathVariable long idappPhone,String CodePin) {
	return appPhone.SupprimerCompt(idappPhone, CodePin);
   }*/
   
}
