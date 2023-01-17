package com.momo.momo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class  Compte{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCompte;
	private Double Solde;
	private String Codepin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTransaction")
	private Transaction transaction;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Compte(Double solde, String codepin) {
		super();
		Solde = solde;
		Codepin = codepin;
	}
	public Transaction getTransaction() {
		return transaction;
	}



	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	public Double getSolde() {
		return Solde;
	}
	public void setSolde(Double solde) {
		Solde = solde;
	}
	public String getCodepin() {
		return Codepin;
	}
	public void setCodepin(String codepin) {
		Codepin = codepin;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte +  ", Solde=" + Solde + ", Codepin=" + Codepin
				+ "]";
	}
}
