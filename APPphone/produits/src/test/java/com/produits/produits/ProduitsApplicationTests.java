package com.produits.produits;



import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.produits.produits.entities.Produit;
import com.produits.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

  @Autowired
  private ProduitRepository produitRepository;
     
  @Test
  public void  testCreateProduit() {
	  Produit prod = new Produit("Dell 2", 150.10, new Date());
	  prod.toString();
	  System.out.println("Produit : "+ prod);
	  produitRepository.save(prod);
  }

}
