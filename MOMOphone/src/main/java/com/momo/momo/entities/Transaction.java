package com.momo.momo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Transaction {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idTransaction;
	private Double depot;
	private Double  retrait;
	private Date date;
	private int numeroTel;
	@OneToMany (fetch=FetchType.LAZY, mappedBy = "transaction")
	private List<Compte> comptes;
	

	public Transaction(Double depot, Double retrait, Date date, int numeroTel, User user) {
		super();
		this.depot = depot;
		this.retrait = retrait;
		this.date = date;
		this.numeroTel = numeroTel;
		this.user = user;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}
	public Double getDepot() {
		return depot;
	}
	public void setDepot(Double depot) {
		this.depot = depot;
	}
	public Double getRetrait() {
		return retrait;
	}
	public void setRetrait(Double retrait) {
		this.retrait = retrait;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}
	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	@Override
	public String toString() {
		return "Transaction [idTransaction=" + idTransaction + ", depot=" + depot + ", retrait=" + retrait + ", date="
				+ date + ", numeroTel=" + numeroTel + ", user=" + user + "]";
	}
}
