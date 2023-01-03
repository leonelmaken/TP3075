package Service;

import java.util.List;

import modele.Compte;
import org.springframework.http.ResponseEntity;

public interface AppPhone<Transaction> {
    ResponseEntity<String> CreerCompt(Compte compte);
    ResponseEntity<String> ModifierInfo(long idUser, Compte compte);
    void ChangeLangue();
    void Transaction();
    ResponseEntity<Double> ConsultSolde(long idUser, int Numero);
    String SupprimerCompt(long idUser,String CodePin);
    List<Transaction> DernierTransac();
}
