package com.momo.momo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idUser;
	private String username;
	private int numeroTel;
	private int CNI;
	
	@OneToMany (fetch=FetchType.LAZY, mappedBy = "user")
	private List<Compte> comptes;
	@OneToMany (fetch=FetchType.LAZY, mappedBy = "user")
	private List<ComptStructure> comptStructures;
	@OneToMany (fetch=FetchType.LAZY, mappedBy = "user")
	private List<ResponsableDeCoin> responsableDeCoinsdes;
	@OneToMany (fetch=FetchType.LAZY, mappedBy = "user")
	private List<Transaction> Transactions;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, int numeroTel, int cNI) {
		super();
		this.username = username;
		this.numeroTel = numeroTel;
		CNI = cNI;
	}

	public List<ComptStructure> getComptStructures() {
		return comptStructures;
	}

	public void setComptStructures(List<ComptStructure> comptStructures) {
		this.comptStructures = comptStructures;
	}

	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	public int getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}
	public int getCNI() {
		return CNI;
	}
	public void setCNI(int cNI) {
		CNI = cNI;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public List<ResponsableDeCoin> getResponsableDeCoinsdes() {
		return responsableDeCoinsdes;
	}

	public void setResponsableDeCoinsdes(List<ResponsableDeCoin> responsableDeCoinsdes) {
		this.responsableDeCoinsdes = responsableDeCoinsdes;
	}
	public List<Transaction> getTransactions() {
		return Transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		Transactions = transactions;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", numeroTel=" + numeroTel + ", CNI=" + CNI +"]";
	}	
}
