package controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Service.UserService;
import lombok.AllArgsConstructor;
import modele.Compte;

@RestController
@RequestMapping(value="/APPphone")
@AllArgsConstructor
public class AppPhoneControler {
private final UserService user = new UserService();
   
   @PostMapping(path="/create")
   public Compte CréerCompt(@RequestBody Compte compte) {
	   System.out.println("le compte :"+user.CréerCompt(compte));
	   return user.CréerCompt(compte);			
	
   }
   @PutMapping(path="/update/{idUser}")
   public Compte update(@PathVariable long idUser,Compte compte) {
	return user.ModifierInfo(idUser,compte);
   }
   @DeleteMapping(path="/delete")
   public String delete(@PathVariable long idUser,String CodePin) {
	return user.SupprimerCompt(idUser, CodePin);
   }
   
}
