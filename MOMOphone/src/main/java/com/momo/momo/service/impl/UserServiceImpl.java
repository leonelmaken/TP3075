package com.momo.momo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.momo.momo.entities.Compte;
import com.momo.momo.entities.Transaction;
import com.momo.momo.entities.User;
import com.momo.momo.repos.CompteRepository;
import com.momo.momo.repos.TransactionRepos;
import com.momo.momo.repos.UserRepository;
import com.momo.momo.service.api.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CompteRepository compteRepository;
	
	@Autowired
	TransactionRepos transactionRepos;
	
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
		Optional<User> use = userRepository.findById(id);
		if(use.isEmpty()) {
			return new ResponseEntity<>(
					"Le user n'existe pas ",
					HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		}
		if (user.getUsername() != null && !use.get().getUsername().equals(user.getUsername())) {
			use.get().setUsername(user.getUsername());
		}
		if (user.getNumeroTel()!= 0 && !(use.get().getNumeroTel() == user.getNumeroTel()))
		{
			use.get().setNumeroTel(user.getNumeroTel());
		}
		userRepository.saveAndFlush(use.get());
		return new ResponseEntity<>(
				"Le User a été modifié avec succès",
				HttpStatus.INTERNAL_SERVER_ERROR);
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

	@Override
	public Compte
	ConsulterSolde(Compte compte) {
		// TODO Auto-generated method stub
		return compteRepository.findById(compte.getIdCompte()).get();
	}

	@Override
	public Transaction saveDepot(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepos.save(transaction);
	}
}
