package com.momo.momo.service.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.ResponsableDeCoin;

public interface ResponsableDeCoinService {
	   ResponseEntity<String> saveRespon(ResponsableDeCoin responD);
	   ResponseEntity<String> updateRespon(ResponsableDeCoin responD);
	   String deleteResponById(Long id);
	   ResponsableDeCoin getRespon(Long id);
	   List<ResponsableDeCoin> getAllResponsD();
}
