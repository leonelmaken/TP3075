package compteStructure;

import java.util.Random;
public class Compte {
    private int IdCompte;
    private float Solde;
    private static final Random random = new Random() ;

    public Compte() {
        IdCompte = random.nextInt(10000000);
        Solde = 0f;
    }

    public int getIdCompte() {
        return IdCompte;
    }
}
