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
	private String username;
	private Double Solde;
	private String Codepin;
	private int numeroTel;
	private int CNI;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;
  
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Compte(String username, Double solde, String codepin, int numeroTel, int cNI) {
		super();
		this.username = username;
		Solde = solde;
		Codepin = codepin;
		this.numeroTel = numeroTel;
		CNI = cNI;
	}
	public int getCNI() {
		return CNI;
	}

	public void setCNI(int cNI) {
		CNI = cNI;
	}
	public Long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public int getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", username=" + username + ", Solde=" + Solde + ", Codepin=" + Codepin
				+ ", numeroTel=" + numeroTel + ", CNI=" + CNI + "]";
	}
}
