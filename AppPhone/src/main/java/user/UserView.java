package user;

import compteStructure.Compte;

public interface UserView {
    public Compte CreerCompte(long numeroTel, String codePin);
    public void ModifierCompte(int IdUser, long numeroTel, String CodePin);
    public void Transaction(int IdCompte, String CodePin, long NumeroTel, int Somme);
    public void ChangerLangue();
    public void ConsulterSolde(int NumeroTel, String CodePin);

}
