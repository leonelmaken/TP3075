package metier;

public interface AppPhoneInter<Solde, Compte> {
    public Compte CréerCompt(Compte c);
    public void SupprimerCompt(int IDCompt);
    public void ModifierCompt(int IDCompt);
    public void Transcation();
    public void ChangerLangue();
    public Solde ConsulterSolde(Solde solde);
    
}
