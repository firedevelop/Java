package j0072_T13_Conexion_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    // Replace with your actual database credentials
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String BBDD = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "your_username";
    private static final String PASSWORD = "your_password";

    public static Connection getDBConnection() {
        Connection con = null;

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(BBDD, USUARIO, PASSWORD);
            System.out.println("Connected to database successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }

        return con;
    }

    public static void main(String[] args) {
        Connection connection = getDBConnection();
        if (connection != null) {
            // Do something with the connection, e.g., execute queries
            // ...
            try {
                connection.close();
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}