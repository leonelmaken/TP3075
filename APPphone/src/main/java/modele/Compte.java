package modele;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Compte {
	
	private Long idUser;
    private String Username;
    private int Numero;
    private String CodePin;
    public Compte() {
    	this.setCodePin(CodePin);
    	this.setIdUser(idUser);
    	this.setNumero(Numero);
    	this.setUsername(Username);
    }
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCodePin() {
		return CodePin;
	}
	public void setCodePin(String codePin) {
		CodePin = codePin;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	@Override
	public String toString() {
		return "Compte [idUser=" + idUser + ", Username=" + Username + ", Numero=" + Numero + ", CodePin=" + CodePin
				+ "]";
	}
	
}
