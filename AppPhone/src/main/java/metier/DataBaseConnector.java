package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {

    private final String dbURL = "jdbc:mysql://localhost:3306/MoBileDao";
    private final String userName = "root";
    private final String password = "";
    private Connection connection;

    public DataBaseConnector() {
        System.out.println("\n          Connexion à la base de donnée...");;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, userName, password);
            if (connection!=null) System.out.println("          Connexion établie.\n");
            else System.out.println("          Connexion échouée.\n");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        if (connection!=null)
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public Connection getConnection() {
        return connection;
    }

  /*
    @Override
    public String toString() {
        return "DBConnection:" +
                "\n\tURL = " + dbURL +
                "\n\tUserName = " + userName +
                "\n\tPassword = " + password +
                "\n\tConnection = " + connection;
    }
  */

}
