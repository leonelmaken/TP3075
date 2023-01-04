package Service.api;

import java.util.List;

import modele.Compte;
import org.springframework.http.ResponseEntity;

<<<<<<< HEAD:APPphone/src/main/java/Service/api/AppPhone.java
@Service
public interface AppPhone  {
    ResponseEntity<Object> CréerCompt(Compte compte);
    ResponseEntity<String> ModifierInfo(long idUser,Compte compte);
    public void ChangeLangue();
    public void Transaction();
    public void ConsultSolde(long idUser,int Numero);
=======
public interface AppPhone<Transaction> {
    ResponseEntity<String> CreerCompt(Compte compte);
    ResponseEntity<String> ModifierInfo(long idUser, Compte compte);
    void ChangeLangue();
    void Transaction();
    ResponseEntity<Double> ConsultSolde(long idUser, int Numero);
>>>>>>> 198084e73bd371ac45565bc07fab4f891594f07e:APPphone/src/main/java/Service/AppPhone.java
    String SupprimerCompt(long idUser,String CodePin);
    List<Transaction> DernierTransac();
}
