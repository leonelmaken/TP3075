package Service;

import java.util.List;

import modele.Compte;

public interface AppPhone<Transaction> {
    Compte CréerCompt(Compte compte);
    Compte ModifierInfo(long idUser,Compte compte);
    public void ChangeLangue();
    public void Transaction();
    public void ConsultSolde(long idUser,int Numero);
    String SupprimerCompt(long idUser,String CodePin);
    public List<Transaction> DernierTransac();
}
