package Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

<<<<<<< HEAD:APPphone/src/main/java/Service/impl/UserService.java
import Service.api.AppPhone;
=======
>>>>>>> 198084e73bd371ac45565bc07fab4f891594f07e:APPphone/src/main/java/Service/UserService.java
import lombok.RequiredArgsConstructor;
import modele.Compte;
import repository.ComptRepository;

@SuppressWarnings({ "hiding" })
@Service
@RequiredArgsConstructor


public class UserService implements AppPhone{
<<<<<<< HEAD:APPphone/src/main/java/Service/impl/UserService.java
    @Autowired
	 ComptRepository comptrepo;
=======

	private  ComptRepository comptrepo;
>>>>>>> 198084e73bd371ac45565bc07fab4f891594f07e:APPphone/src/main/java/Service/UserService.java

	@Override
	public ResponseEntity<String> ModifierInfo(long idUser, Compte compte) {
		Optional<Compte> compt = comptrepo.findById(idUser);
		if(compt.isEmpty()) {
			return new ResponseEntity<>(
					"Id n'existe pas",
					HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		}

		if (compte.getUserName() != null && !compt.get().getUserName().equals(compte.getUserName())) {
			compt.get().setUserName(compte.getUserName());
		}
		//return App.findById(idUser);
		comptrepo.saveAndFlush(compt.get());
		return new ResponseEntity<>(
				"Le compte a été modifié",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public void ChangeLangue() {
		// TODO Auto-generated method stub

	}

	public void Transaction() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResponseEntity<Double> ConsultSolde(long idUser, int Numero) {
		Optional<Compte> compt = comptrepo.findById(idUser);
		if(compt.isEmpty()) {
			return new ResponseEntity<>(
					0.0,
					HttpStatus.INTERNAL_SERVER_ERROR); // Renvoie une erreur 500

		} else {

		}
		comptrepo.saveAndFlush(compt.get());
		return new ResponseEntity<>(
				compt.get().getSolde(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public List DernierTransac() {
		// TODO Auto-generated method stub
		return ((ListCrudRepository<Compte, Long>) comptrepo).findAll();
<<<<<<< HEAD:APPphone/src/main/java/Service/impl/UserService.java
	}*/
	
	@Override
	public
	 ResponseEntity<Object> CréerCompt(Compte compte) {
		// TODO Auto-generated method stub
		System.out.println("le compte :"+compte);
		System.out.println("////////le username :"+compte.getUserName());
	try {
			if (compte.getUserName().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer Votre User name", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (compte.getNumero()==0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer Votre Numéro de téléphone", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (compte.getCodePin().equals(null)) {
		        return new ResponseEntity<>(
		          "Vous devez entrer votre code Pin", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }
		   else if (compte.getNumeroCni()==0) {
		        return new ResponseEntity<>(
		          "Vous devez entrer votre Numéro de CNI", 
		          HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		    }

			compte = comptrepo.save(compte);
		   return new ResponseEntity<>(
				      "Votre Compte a été enregistré avec succès " + compte, 
				      HttpStatus.OK);	
	}catch(Exception e) {
		return new ResponseEntity<>(
			      "Erreur 500",HttpStatus.INTERNAL_SERVER_ERROR);	
	}
		
=======
	}
	@Override public ResponseEntity<String> CreerCompt(Compte compte) {
		// TODO Auto-generated method stub
		System.out.println("le compte :"+compte);
		System.out.println("////////le username :"+compte.getUserName());
		if (compte.getUserName() == null) {
			return new ResponseEntity<>(
					"Vous devez entrer Votre User name",
					HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		}
		else if (compte.getNumero()==0) {
			return new ResponseEntity<>(
					"Vous devez entrer Votre Numéro de téléphone",
					HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		}
		else if (compte.getCodePin() == null) {
			return new ResponseEntity<>(
					"Vous devez entrer votre code Pin",
					HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		}
		else if (compte.getNumeroCni()==0) {
			return new ResponseEntity<>(
					"Vous devez entrer votre Numéro de CNI",
					HttpStatus.INTERNAL_SERVER_ERROR);//renvoie une erreur 500
		}

		comptrepo.save(compte);
		return new ResponseEntity<>(
				"Votre Compte a été enregistré avec succès " + compte,
				HttpStatus.OK);
>>>>>>> 198084e73bd371ac45565bc07fab4f891594f07e:APPphone/src/main/java/Service/UserService.java
	}

	@Override
	public String SupprimerCompt(long idUser, String CodePin) {
		// TODO Auto-generated method stub
		((CrudRepository<Compte, Long>) comptrepo).deleteById(idUser);
		return "Compte supprimé Supprimé";
	}
}