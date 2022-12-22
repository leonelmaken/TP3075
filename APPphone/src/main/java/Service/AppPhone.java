package Service;

import java.util.List;

public interface AppPhone<Compte,Transaction> {
    public Compte CréerCompt(int Numero, String CodePin);
    public void ModifierInfo(long idUser,int Numero, String CodePin);
    public void ChangeLangue();
    public void Transaction();
    public void ConsultSolde(long idUser,int Numero);
    public void SupprimerCompt(int Numero,String CodePin,long idUser);
    public List<Transaction> DernierTransac();
}
