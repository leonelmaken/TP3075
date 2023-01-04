package Service.api;

import java.util.List;

import modele.Compte;
import modele.ResponsableCoin;
import modele.User;

public interface Admin {
	 public List<User> listeUser();
	  public void ActiverCompt();
	  public void saveRespons();
	  public List<Compte> AfficheCompte();
	  Compte rechercheCompte(int Numero);
	  public void supprimerRespons(Long id,int Numero);
	  public List<ResponsableCoin> ListeRespons();
}
