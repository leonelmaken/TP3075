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
	
	/*@Test
	void saveUser() {
		User user = new User("Anna",650783695,879652);
		userRepository.save(user);
		Assertions.assertNotNull(user.getIdUser());
	}*/
/*   @Test
	void testFindUser()
	{
		User user = userRepository.findById(4L).get();
		System.out.println("Le user est :"+user.toString());
	}
   
	@Test
	void testFindByUsername()
	{
		User user = userRepository.findByUsername("Dave");
		System.out.println("Le user est :"+user.toString());
	}
	@Test
	void testFindByUserNumeber()
	{
		User user = userRepository.findByNumeroTel(628995631);
		System.out.println("Le numéro de téléphone :" + user.getNumeroTel() + "  appartient à l'User :" +user.getUsername());
	}
	/*@Test
	void testDeleteByUserNumber()
	{
		userRepository.deleteByNumeroTel(658258693);
		System.out.println("Le user avec le numéro  a été supprimé !");
	}*/

	/*@Test
	void testUpdateUser()
	{
		User user = userRepository.findById(2L).get();
		user.setUsername("Mike");
		user.setNumeroTel(688963215);
		userRepository.save(user);
		System.out.println("User a été modifié avec succès :"+user.toString());
	}*/
	/*@Test
	void testDeleteUser()
	{
		
		Assertions.assertThrows(Exception.class, ()->{userRepository.deleteById(11L);} );
	}*/
	
	/*@Test
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
		Compte compt = new Compte();
		compteRepository.save(compt);
		Assertions.assertNotNull(compt.getIdCompte());
	}*/
	/*@Test
	void testFindCompte()
	{
		Compte compt = compteRepository.findById(1L).get();
		System.out.println(compt);
	}*/
	/*@Test
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
	/*@Test
	void testFillAllCompte()
	{
		List<Compte> compts = compteRepository.findAll();
		for(Compte compt:compts)
			System.out.println(compt);
	}*/
    
	/*===================================Admin===================================*/
     @Autowired
     AdminRepository adminRepository;
   /* @Test
	void saveAdmin() {
    	User user = new User();
    	user.setIdUser(2L);
    	user.setCNI(25639);
    	user.setNumeroTel(699124538);
    	user.setUsername("Anna");
		Admin admin = new Admin("Anna123",user);
		System.out.println("L' admin :" + admin);
	    try {

			adminRepository.save(admin);	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
		Assertions.assertNotNull(admin.getIdAdmin());
	}*/
 /*   @Test
	void testFindAdmin()
	{
    	User user = new User();
    	user.getCNI();
    	user.getIdUser();
    	user.getNumeroTel();
    	user.getUsername();
    	try {
    	Admin admin = adminRepository.findById(1L).get();
    	System.out.println(admin.getUser().getIdUser());
    	}catch(Exception e) {
	    	e.printStackTrace();
	    }
		
	}*/
	void testFillAllAdmin()
	{
		List<Admin> admins = adminRepository.findAll();
		for(Admin admin:admins)
			System.out.println("Tous les admins :"+admin.toString());
	}
}
