package com.momo.momo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.momo.momo.entities.User;
import com.momo.momo.repos.UserRepository;
import com.momo.momo.service.api.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public ResponseEntity<String> saveUser(User user) {
		try {
			if (user.getUsername().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer Votre User name", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (user.getNumeroTel()==0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer Votre Numéro de téléphone", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (user.getCNI()==0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer votre Numéro de CNI", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
			   userRepository.save(user);
			   return new ResponseEntity<>(
					      "Vous avez été enregistré avec succès " + userRepository.save(user), 
					      HttpStatus.OK);	
		}catch(Exception e) {
			return new ResponseEntity<>(
				      "Erreur 500",HttpStatus.INTERNAL_SERVER_ERROR);	
		}

	}

	@Override
	public ResponseEntity<String> updateUser(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserById(Long id) {
		userRepository.deleteById(id);
		return "Le user a été supprimé";
	}

	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public String deleteUserByNumero(int numeroTel) {
		userRepository.deleteByNumeroTel(numeroTel);
		return "le User a été supprimé";
	}

	@Override
	public User getUserNumero(int numeroTel) {
		return userRepository.findByNumeroTel(numeroTel);
	}

	@Override
	public User getUserByName(String username) {
		return userRepository.findByUsername(username);
	}

}
