package com.momo.momo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ComptStructure {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idComptStructure;
	private String localite;
	private String description;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ComptStructure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComptStructure(Long idComptStructure, String localite, String description) {
		super();
		this.idComptStructure = idComptStructure;
		this.localite = localite;
		this.description = description;
	}
	public Long getIdComptStructure() {
		return idComptStructure;
	}
	public void setIdComptStructure(Long idComptStructure) {
		this.idComptStructure = idComptStructure;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ComptStructure [idComptStructure=" + idComptStructure + ", localite=" + localite + ", description="
				+ description + ", user=" + user + "]";
	}
}
