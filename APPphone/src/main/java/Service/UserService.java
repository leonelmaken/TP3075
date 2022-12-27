package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import modele.Compte;
import repository.AppRepository;

@SuppressWarnings({ "rawtypes", "hiding" })
@Service
@AllArgsConstructor
public class UserService implements AppPhone{

	private final AppRepository App = null;

	@Override
	
	public Compte ModifierInfo(long idUser, Compte compte) {
		
		return App.findById(idUser);
	}

	@Override
	public void ChangeLangue() {
		// TODO Auto-generated method stub
		
	}

	public void Transaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsultSolde(long idUser,int Numero) {
		// TODO Auto-generated method stub
	}

	@Override
	public List DernierTransac() {
		// TODO Auto-generated method stub
		return App.findAll();
	}
	@Override
	public Compte CréerCompt(Compte compte) {
		// TODO Auto-generated method stub
		return App.save(compte);
	}

	@Override
	public String SupprimerCompt(long idUser, String CodePin) {
		// TODO Auto-generated method stub
		return null;
	}
}
