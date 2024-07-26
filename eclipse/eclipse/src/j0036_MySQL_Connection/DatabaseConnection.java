package j0036_MySQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String BBDD = "jdbc:mysql://localhost/sorteo"; // Asegúrate de usar el puerto correcto
    private static final String USUARIO = "root";
    private static final String PASSWORD = "root";

    public Connection conexionBBDD() {
        Connection conec = null;
        try {
            Class.forName(DRIVER);
            conec = DriverManager.getConnection(BBDD, USUARIO, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Se ha producido un error al conectar con la base de datos.\n" + e);
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al conectar con la base de datos.\n" + e);
        }
        return conec;
    }

    public void cerrarConexion(Connection conection) {
        try {
            if (conection != null && !conection.isClosed()) {
                conection.close();
            }
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al cerrar la conexión con la base de datos." + e);
        }
    }

    public void insertData() {
        Connection conec = conexionBBDD();
        if (conec != null) {
            try {
                String consultaInsercion = "INSERT INTO sorteo (fecha, num1, num2, num3, num4, num5, complementario) " +
                        "VALUES ('2020-11-25', '23', '34', '45', '65', '34', '9');";
                System.out.println(consultaInsercion);
                Statement consulta = conec.createStatement();
                consulta.executeUpdate(consultaInsercion);
                System.out.println("Datos insertados correctamente");
                consulta.close();
            } catch (SQLException e) {
                System.err.println("Se ha producido un error al insertar en la base de datos.\n" + e);
            } finally {
                cerrarConexion(conec);
            }
        }
    }

    public void getData() {
        Connection conec = conexionBBDD();
        if (conec != null) {
            try {
                String consultaSeleccion = "SELECT * FROM sorteo;";
                System.out.println(consultaSeleccion);
                Statement consulta = conec.createStatement();
                if (consulta.execute(consultaSeleccion)) {
                    ResultSet resultSet = consulta.getResultSet();
                    while (resultSet.next()) {
                        Sorteo sorteo = new Sorteo(
                                resultSet.getInt("id"),
                                resultSet.getString("fecha"),
                                resultSet.getString("num1"),
                                resultSet.getString("num2"),
                                resultSet.getString("num3"),
                                resultSet.getString("num4"),
                                resultSet.getString("num5"),
                                resultSet.getString("complementario")
                        );
                        System.out.println(sorteo.toString());
                    }
                }
                System.out.println("Datos recuperados correctamente");
                consulta.close();
            } catch (SQLException e) {
                System.err.println("Se ha producido un error al insertar en la base de datos.\n" + e);
            } finally {
                cerrarConexion(conec);
            }
        }
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.insertData();
        db.getData();
    }
}

class Sorteo {
    private int id;
    private String fecha;
    private String num1;
    private String num2;
    private String num3;
    private String num4;
    private String num5;
    private String complementario;

    public Sorteo(int id, String fecha, String num1, String num2, String num3, String num4, String num5, String complementario) {
        this.id = id;
        this.fecha = fecha;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.complementario = complementario;
    }

    @Override
    public String toString() {
        return "Sorteo{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", num1='" + num1 + '\'' +
                ", num2='" + num2 + '\'' +
                ", num3='" + num3 + '\'' +
                ", num4='" + num4 + '\'' +
                ", num5='" + num5 + '\'' +
                ", complementario='" + complementario + '\'' +
                '}';
    }
}
