
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 * @version 0.2
 */
public class Conexion {
    
    public static final String URL = "jdbc:mysql://127.0.0.1/biblioteca";
    public static final String USERNAME = "root";
     public static final String PASSWORD = "";
   // public static final String PASSWORD = "inever&9";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return connection;
    }
}

    