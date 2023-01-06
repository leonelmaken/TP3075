package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import repository.AppRepository;

@SuppressWarnings("rawtypes")
@Service
@AllArgsConstructor
public class UserService<Compt, Solde> implements AppPhone{

	private final AppRepository App = null;
	@Override
	public Compt CréerCompt(int Numero, String CodePin) {
		// TODO Auto-generated method stub
		return App.save(Compt);
	}

	@Override
	public void ModifierInfo(long idUser, int Numero, String CodePin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChangeLangue() {
		// TODO Auto-generated method stub
		
	}

	public void Transaction() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void ConsultSolde(long idUser,int Numero) {
		// TODO Auto-generated method stub
	}

	@Override
	public List DernierTransac() {
		// TODO Auto-generated method stub
		return App.findAll();
	}
}
