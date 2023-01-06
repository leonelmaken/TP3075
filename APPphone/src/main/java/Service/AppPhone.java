package Service;

import java.util.List;

public interface AppPhone<Compt, Solde, Transaction, Forfait> {
    public Compt CréerCompt(int Numero, String CodePin);
    public void ModifierInfo(long idUser,int Numero, String CodePin);
    public void ChangeLangue();
    public void Transaction();
    public void ConsultSolde(long idUser,int Numero);
    public List<Transaction> DernierTransac();
}
