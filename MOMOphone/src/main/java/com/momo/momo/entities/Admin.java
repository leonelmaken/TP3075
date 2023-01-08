package com.momo.momo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Admin {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idAdmin;
	private String username;
	private String CodeAdmin;
	private int numeroTel;
	private int CNI;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinTable(name="user_admin",joinColumns = @JoinColumn(name = "idAdmin"),inverseJoinColumns = @JoinColumn(name ="idUser" ))
	private User user;
	@OneToOne
	@JoinColumn(name="compteAdmin")
	private Compte compte;
	
	public Compte getCompte() {
		return compte;
	}


	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Admin(Long idAdmin, String username, String codeAdmin, int numeroTel, int cNI, User user) {
		super();
		this.idAdmin = idAdmin;
		this.username = username;
		CodeAdmin = codeAdmin;
		this.numeroTel = numeroTel;
		CNI = cNI;
		this.user = user;
	}


	public Long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCodeAdmin() {
		return CodeAdmin;
	}
	public void setCodeAdmin(String codeAdmin) {
		CodeAdmin = codeAdmin;
	}
	public int getNumeroTel() {
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", username=" + username + ", CodeAdmin=" + CodeAdmin + ", numeroTel="
				+ numeroTel + ", CNI=" + CNI + ", user=" + user + "]";
	}
}
