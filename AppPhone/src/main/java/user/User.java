package user;

import compteStructure.Compte;

public class User implements UserView {

    public String Nom;
    public int NumeroCNI;
    public int NumeroCompte;
    public String CodePin;
    public long NumeroTel;
    private final Compte Compt;

    // Chaque utilisateur est lié à un compte par un seul contact
    public User(String nom, int numeroCNI, String codePin, long numTel) {
        Nom = nom;
        NumeroCNI = numeroCNI;
        CodePin = codePin;
        NumeroTel = numTel;
        Compt = CreerCompte(numTel, codePin);
        NumeroCompte = Compt.getIdCompte();
    }

    @Override
    public Compte CreerCompte(long numeroTel, String codePin) {
        /*
        * Code
        * */
        return new Compte();
    }

    @Override
    public void ModifierCompte(int IdUser, long numeroTel, String CodePin) {
        /*
         * Code
         * */
    }

    @Override
    public void Transaction(int IdCompte, String CodePin, long NumeroTel, int Somme){
        /*
        * Code
        * */
    }

    @Override
    public void ChangerLangue(){
        /*
        * Code
        * */
    }

    @Override
    public void ConsulterSolde(int IdUser, String CodePin){
        /*
        * Code
        * */
    }

}
