package modele;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {
    private String Username;
    private int NumeroCNI;
    private String CodePin;
    public User(int NumeroCNI,String CodePin,String Username) {
    	this.setNumeroCNI(NumeroCNI);
    	this.setCodePin(CodePin);
    	this.setUsername(Username);
    }
	public String getCodePin() {
		return CodePin;
	}
	public void setCodePin(String codePin) {
		CodePin = codePin;
	}
	public int getNumeroCNI() {
		return NumeroCNI;
	}
	public void setNumeroCNI(int numeroCNI) {
		NumeroCNI = numeroCNI;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String toString() {
		return "Username : "+this.Username+" CodePin: "+this.CodePin+" NumeroCNI: "+this.NumeroCNI;
		
	}
}
