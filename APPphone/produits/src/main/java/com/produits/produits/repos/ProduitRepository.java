package com.produits.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produits.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
