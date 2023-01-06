package com.momo.momo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.momo.momo.entities.Compte;
import com.momo.momo.repos.CompteRepository;

@SpringBootTest
class MomOphoneApplicationTests {
	
    @Autowired
	private CompteRepository compteRepository;
	
	@Test
	void contextLoads() {
		Compte compt = new Compte("Pamm",80000.15,"Dopp123",677869312,153428);
		compteRepository.save(compt);
		Assertions.assertNotNull(compt.getIdCompte());
	}
	@Test
	void testFindCompte()
	{
		Compte compt = compteRepository.findById(1L).get();
		System.out.println(compt);
	}
	@Test
	void testUpdateCompte()
	{
		Compte compt = compteRepository.findById(1L).get();
		compt.setSolde(30000.5);
		compteRepository.save(compt);
	}
	@Test
	void testDeleteCompte()
	{
		
		Assertions.assertThrows(Exception.class, ()->{compteRepository.deleteById(5L);} );
	}
	@Test
	void testFillAllCompte()
	{
		List<Compte> compts = compteRepository.findAll();
		for(Compte compt:compts)
			System.out.println(compt);
	}
}