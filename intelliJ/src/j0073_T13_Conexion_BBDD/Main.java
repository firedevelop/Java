package j0073_T13_Conexion_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Establishing the database connection
            String url = "jdbc:mysql://localhost:3306/your_database"; // Replace 'your_database' with your database name
            String user = "your_user"; // Replace with your DB username
            String password = "your_password"; // Replace with your DB password
            cn = DriverManager.getConnection(url, user, password);

            // Create a statement
            st = cn.createStatement(); // En blanco 1

            // Query to select data
            String sql1 = "SELECT * FROM cuenta_bancarias"; // En blanco 2
            rs = st.executeQuery(sql1);

            // Displaying the data
            while (rs.next()) { // En blanco 3
                System.out.println(rs.getString("propietarios") + " "
                        + rs.getString(2) + " "
                        + rs.getInt("saldoc"));
            }

            // Query to update data
            int cantidad = 100; // Replace with the amount to subtract
            String codigo = "ABC123"; // Replace with the account code to update
            String sql2 = "UPDATE cuentas SET saldoc = saldoc - "
                    + cantidad + " WHERE codigo = '"
                    + codigo + "' AND saldoc >= "
                    + cantidad; // En blanco 4

            // Execute the update
            st.executeUpdate(sql2); // En blanco 5
            System.out.println("Update successful!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
