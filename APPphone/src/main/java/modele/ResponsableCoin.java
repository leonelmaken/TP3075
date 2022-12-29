package modele;

import java.sql.*;

public class ResponsableCoin {

    public double retrait(double montantretrait,int codepin) {

        try {
            DBConnection db = new DBConnection();
            Statement State = db.getConnection().createStatement();
            ResultSet result= State.executeQuery("SELECT * FROM Users WHERE IdUser = 1");

            double montantinit = 0; int code = 0;
            while (result.next()){
                code = result.getInt("CodePin");
                montantinit = result.getLong("Solde");
            }
            {}
            if(codepin == code) {
                if(montantretrait <= montantinit) {
                    montantinit = montantinit - montantretrait;

                }
                else {
                    System.out.println("montant insuffisant");
                }
            }
            else {
                System.out.println("code pin incorrect");
            }

            result.close();
            State.close();

        }catch(Exception e) {
            e.printStackTrace();
        }

        return montantretrait;





    }
}
