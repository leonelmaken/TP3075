package com.momo.momo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.momo.momo.entities.Admin;
import com.momo.momo.entities.Compte;
import com.momo.momo.entities.ResponsableDeCoin;
import com.momo.momo.entities.User;
import com.momo.momo.repos.AdminRepository;
import com.momo.momo.repos.CompteRepository;
import com.momo.momo.repos.ResponsableDeCoinRepository;
import com.momo.momo.repos.UserRepository;

@SpringBootTest
class MomOphoneApplicationTests {
	
	/*===================================Users===================================*/
	
	@Autowired
	private UserRepository userRepository;
	/*
	@Test
	void saveUser() {
		User user = new User("Olla",677251364,485623);
		userRepository.save(user);
		Assertions.assertNotNull(user.getIdUser());
	}*/
	@Test
	void testFindUser()
	{
		User user = userRepository.findById(4L).get();
		System.out.println("Le user est :"+user.toString());
	}
	@Test
	void testFindByUsername()
	{
		User user = userRepository.findByUsername("Kalicy");
		System.out.println("Le user est :"+user.toString());
	}
	@Test
	void testFindByUserNumeber()
	{
		User user = userRepository.findByNumeroTel(655189320);
		System.out.println("Le numéro de téléphone :" + user.getNumeroTel() + "  appartient à l'User :" +user.getUsername());
	}
	@Test
	void testDeleteByUserNumber()
	{
		userRepository.deleteByNumeroTel(658258693);
		System.out.println("Le user avec le numéro  a été supprimé !");
	}

	/*@Test
	void testUpdateUser()
	{
		User user = userRepository.findById(2L).get();
		user.setUsername("Yvan");
		userRepository.save(user);
		System.out.println("User modifié:"+user.toString());
	}*/
	/*@Test
	void testDeleteUser()
	{
		
		Assertions.assertThrows(Exception.class, ()->{userRepository.deleteById(8L);} );
	}*/
	
	@Test
	void testFillAllUser()
	{
		List<User> users = userRepository.findAll();
		for(User user:users)
			System.out.println("le Users est  :"+user.toString());
	}
	
	/*===================================Compte===================================*/
    @Autowired
	private CompteRepository compteRepository;
	
	/*@Test
	void contextLoads() {
		Compte compt = new Compte("Elena",80000.15,"Dop123",677849313,157728);
		compteRepository.save(compt);
		Assertions.assertNotNull(compt.getIdCompte());
	}*/
	@Test
	void testFindCompte()
	{
		Compte compt = compteRepository.findById(1L).get();
		System.out.println(compt);
	}
/*	@Test
	void testUpdateCompte()
	{
		Compte compt = compteRepository.findById(1L).get();
		compt.setSolde(30000.5);
		compteRepository.save(compt);
	}*/
	/*@Test
	void testDeleteCompte()
	{
		
		Assertions.assertThrows(Exception.class, ()->{compteRepository.deleteById(4L);} );
	}*/
	@Test
	void testFillAllCompte()
	{
		List<Compte> compts = compteRepository.findAll();
		for(Compte compt:compts)
			System.out.println(compt);
	}

}
