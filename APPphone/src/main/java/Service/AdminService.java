package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import modele.Compte;

@SuppressWarnings({ "unused", "rawtypes" })
public class AdminService implements Admin{
    
	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public List listeUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ActiverCompt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveRespons() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerRespons(Long id, int Numero) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List ListeRespons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> AfficheCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte rechercheCompte(int Numero) {
		// TODO Auto-generated method stub
		return null;
	}
}

