package controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.UserService;
import lombok.AllArgsConstructor;
import modele.Compte;

@RestController
@RequestMapping(value="/Acceuil")
@AllArgsConstructor
public class AppPhoneControler {
   @SuppressWarnings({ "rawtypes", "unused" })
private final UserService user = new UserService();
   
   @PostMapping(path="/create")
   public Compte CréerCompt(@RequestBody Compte compte) {
	return user.CréerCompt(compte);
   }
   @PostMapping(path="/update/{idUser}")
   public Compte update(@PathVariable long idUser,Compte compte) {
	return user.ModifierInfo(idUser,compte);
   }
   @PostMapping(path="/delete")
   public String delete(@PathVariable long idUser,String CodePin) {
	return user.SupprimerCompt(idUser, CodePin);
	   
   }
   
}
