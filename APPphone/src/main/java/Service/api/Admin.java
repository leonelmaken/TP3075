package Service.api;

import java.util.List;

import modele.Compte;
import modele.ResponsableCoin;
import modele.User;

public interface Admin {
	 List<User> listeUser();
	 void ActiverCompt();
	 void saveRespons();
	 List<Compte> AfficheCompte();
	 Compte rechercheCompte(int Numero);
	 void supprimerRespons(Long id,int Numero);
	 List<ResponsableCoin> ListeRespons();
}
