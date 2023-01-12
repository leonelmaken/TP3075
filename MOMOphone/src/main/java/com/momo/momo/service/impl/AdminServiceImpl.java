package com.momo.momo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.momo.momo.entities.Admin;
import com.momo.momo.entities.Compte;
import com.momo.momo.entities.User;
import com.momo.momo.repos.AdminRepository;
import com.momo.momo.repos.CompteRepository;
import com.momo.momo.repos.UserRepository;
import com.momo.momo.service.api.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;

	@Autowired
	CompteRepository compteRepository;
	
	@Autowired 
	UserRepository userRepository;
	
	@Override
	public ResponseEntity<String> saveAdmin(Admin admin) {
		try {
			if (admin.getUsername().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer Votre User name", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (admin.getNumeroTel()==0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer Votre Numéro de téléphone", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (admin.getCodeAdmin().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer votre code Pin", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (admin.getCNI()==0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer votre Numéro de CNI", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
			 adminRepository.save(admin);
			   return new ResponseEntity<>(
					      "Vous avez été enregistré avec succès en tant que Admin " + adminRepository.save(admin), 
					      HttpStatus.OK);	
		}catch(Exception e) {
			return new ResponseEntity<>(
				      "Erreur 500",HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}

	@Override
	public ResponseEntity<String> updateAdmin(Admin admin, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdminById(Long id) {
		 adminRepository.deleteById(id);
			return "L'admin a été supprimé";
	}

	@Override
	public Admin getAdmin(Long id) {
		return adminRepository.findById(id).get();
	}

	@Override
	public List<Compte> getAllComptes() {
		return compteRepository.findAll();
	}

	@Override
	public Compte getCompte(int numeroTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<Admin> getAllAdmins() {
				return adminRepository.findAll();
	}

	@Override
	public Admin getAdminByUnsername(String username) {
		// TODO Auto-generated method stub
		return adminRepository.findByUsername(username);
	}

}
