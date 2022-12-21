package Service;

import java.util.List;

import modele.ResponsableCoin;
import modele.User;

public interface Admin {
	 public List<User> listeUser();
	  public void ActiverCompt();
	  public void saveRespons();
	  public void supprimerRespons(Long id,int Numero);
	  public List<ResponsableCoin> ListeRespons();
}
