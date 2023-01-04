package Service.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import modele.Compte;

@Service
public interface AppPhone  {
    ResponseEntity<Object> CréerCompt(Compte compte);
    ResponseEntity<String> ModifierInfo(long idUser,Compte compte);
    public void ChangeLangue();
    public void Transaction();
    public void ConsultSolde(long idUser,int Numero);
    String SupprimerCompt(long idUser,String CodePin);
    //List<Transaction> DernierTransac();
}
