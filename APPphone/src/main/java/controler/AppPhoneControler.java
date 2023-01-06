package controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.UserService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value="/Acceuil")
@AllArgsConstructor
public class AppPhoneControler {
   @SuppressWarnings({ "rawtypes", "unused" })
private final UserService user = new UserService();
   
   @PostMapping(path="create")
   public void CréerCompt() {
	   user.CréerCompt(0, null);
   }
}
