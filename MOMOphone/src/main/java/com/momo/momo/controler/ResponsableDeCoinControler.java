package com.momo.momo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.momo.entities.ResponsableDeCoin;
import com.momo.momo.service.api.ResponsableDeCoinService;

@RestController
@RequestMapping(path="/ResponsableDeCoin") 
public class ResponsableDeCoinControler {
	@Autowired
	ResponsableDeCoinService responsableDeCoin;
	@PostMapping(path="/createRespon")
	public ResponseEntity<String> createRespon(@RequestBody ResponsableDeCoin  respon) {
		return responsableDeCoin.saveRespon(respon);	
	}
	
	@GetMapping(path="/readRespon")
	public List<ResponsableDeCoin>  readRespon(){
		return responsableDeCoin.getAllResponsD();	
	}
	@GetMapping(path="/readResponId/{id}")
	public ResponsableDeCoin  readResponId(@PathVariable Long id){
		return responsableDeCoin.getRespon(id);	
	}
	@DeleteMapping(path="/deleteRespon/{id}")
	public String deleteRespon(@PathVariable Long id) {
		return responsableDeCoin.deleteResponById(id);
	}
}
