package modele;

import java.sql.*;

public class ResponsableCoin {

    public void retrait(double montantretrait,int codepin,int nCNI) {

        try {
            DBConnection db = new DBConnection();
            Statement State = db.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = State.executeQuery("SELECT * FROM Users  WHERE NumeroCni = "+nCNI);

            double solde = 0.0; String nameuser = "";
            int code = 0, iduser = 0, idstructure = 0, idadmin = 0, idresp = 0, idcompte = 0, numero = 0, numeroCni = 0;
            while (result.next()) {
                /*
                 *
                 * ici je recuprère toutes les infos concernant le User en question et tu les mets dans des variables.
                 *
                 * */

                iduser = result.getInt("idUser"); idstructure = result.getInt("idStructure");
                idadmin = result.getInt("idAdmin"); idresp = result.getInt("idResp");
                idcompte = result.getInt("idCompte"); nameuser = result.getString("nameUser");
                code = result.getInt("CodePin"); numero = result.getInt("Numero");
                solde = result.getDouble("solde"); numeroCni = result.getInt("NumeroCni");
            }

            if (codepin == code) {
                if (montantretrait <= solde) {
                    solde = solde - montantretrait;
                    /*
                     *
                     * Ces données récupérées plus haut sont les paramètres de cette querry
                     *
                     * */
                    String query = "REPLACE INTO Users (idUser, idStructure, idAdmin, idResp, idCompte, nameUser, CodePin, Numero, Solde, NumeroCni) " +
                            "VALUES ( '"+ iduser +"', '"+ idstructure +"', '"+ idadmin +"', '"+ idresp +"', '"+ idcompte +"', '"+ nameuser +"', '"+ codepin +"', '"+ numero +"', '"+ solde +"', '"+ numeroCni +"')";
                    State.executeUpdate(query);

                    System.out.println("retrait éffectué, voici votre argent" + montantretrait);

                } else {
                    System.out.println("montant insuffisant");
                }
            } else {
                System.out.println("code pin incorrect ou numero de cni incorrect");
            }

            result.close();
            State.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public  void depot(double montant,int nCNI) {
        try {
            DBConnection db = new DBConnection();
            Statement State = db.getConnection().createStatement();
            ResultSet result = State.executeQuery("SELECT * FROM Users WHERE NumeroCni = " + nCNI);
            double solde = 0.0;
            String nameuser = "";
            int code = 0, iduser = 0, idstructure = 0, idadmin = 0, idresp = 0, idcompte = 0, numero = 0, numeroCni = 0;

            while (result.next()) {

                iduser = result.getInt("idUser");
                idstructure = result.getInt("idStructure");
                idadmin = result.getInt("idAdmin");
                idresp = result.getInt("idResp");
                idcompte = result.getInt("idCompte");
                nameuser = result.getString("nameUser");
                code = result.getInt("CodePin");
                numero = result.getInt("Numero");
                solde = result.getDouble("solde");
                numeroCni = result.getInt("NumeroCni");
            }
            solde = solde + montant;

            String query = "REPLACE INTO Users (idUser, idStructure, idAdmin, idResp, idCompte, nameUser, CodePin, Numero, Solde, NumeroCni) " +
                    "VALUES ( '" + iduser + "', '" + idstructure + "', '" + idadmin + "', '" + idresp + "', '" + idcompte + "', '" + nameuser + "', '" + code + "', '" + numero + "', '" + solde + "', '" + numeroCni + "')";
            State.executeUpdate(query);

            System.out.println("votre nouveau solde est de :\t" + solde);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }








}