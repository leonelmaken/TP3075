package com.momo.momo.entities;





import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ResponsableDeCoin {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idRespo;
	private int codeRespo;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public ResponsableDeCoin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getIdRespo() {
		return idRespo;
	}
	public void setIdRespo(Long idRespo) {
		this.idRespo = idRespo;
	}
	public int getCodeRespo() {
		return codeRespo;
	}
	public void setCodeRespo(int codeRespo) {
		this.codeRespo = codeRespo;
	}
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "ResponsableDeCoin [idRespo=" + idRespo + ", username=" + user.getUsername() + ", numeroTel=" + user.getNumeroTel()
				+ ", codeRespo=" + codeRespo + ", user=" + user + "]";
	}
	
}
