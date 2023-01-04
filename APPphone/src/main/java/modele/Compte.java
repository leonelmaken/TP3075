package modele;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
<<<<<<< HEAD
=======
@Getter
@Setter
//@AllArgsConstructor
>>>>>>> 198084e73bd371ac45565bc07fab4f891594f07e
public class Compte {
	private Long idUser;
    private String userName;
    private int numero;
	private double solde;
    private String codePin;
    private int numeroCni;
<<<<<<< HEAD
    
=======

>>>>>>> 198084e73bd371ac45565bc07fab4f891594f07e
    public Compte() {
    }

	public Compte(Long idUser, String userName, int numero, double solde, String codePin, int numeroCni) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.numero = numero;
		this.solde = solde;
		this.codePin = codePin;
		this.numeroCni = numeroCni;
	}

	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodePin() {
		return codePin;
	}
	public void setCodePin(String codePin) {
		this.codePin = codePin;
	}
	public int getNumeroCni() {
		return numeroCni;
	}
	public void setNumeroCni(int numeroCni) {
		this.numeroCni = numeroCni;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [idUser=" + idUser + ", userName=" + userName + ", numero=" + numero + ", codePin=" + codePin
				+ ", numeroCni=" + numeroCni + "]";
	}
	
}
