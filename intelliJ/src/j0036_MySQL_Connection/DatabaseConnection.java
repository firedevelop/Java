package j0036_MySQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class DatabaseConnection {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String BBDD = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "loteria";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "3M3mj8rvvK1ne5Z4";

    public Connection conexionBBDD() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(BBDD + DB_NAME, USUARIO, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Error en DRIVER\n" + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BBDD\n" + e);
        }
        return connection;
    }

    public void cerrarConexion(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al cerrar la conexión con la base de datos." + e);
        }
    }

    public void createDatabaseAndTable() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(BBDD, USUARIO, PASSWORD);
            statement = connection.createStatement();

            // Crear la base de datos si no existe
            String sql = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
            statement.executeUpdate(sql);

            // Usar la base de datos
            statement.executeUpdate("USE " + DB_NAME);

            // Crear la tabla si no existe
            sql = "CREATE TABLE IF NOT EXISTS loteria (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "fecha DATE NOT NULL, " +
                    "num1 INT NOT NULL, " +
                    "num2 INT NOT NULL, " +
                    "num3 INT NOT NULL, " +
                    "num4 INT NOT NULL, " +
                    "num5 INT NOT NULL, " +
                    "complementario INT NOT NULL)";
            statement.executeUpdate(sql);
            System.out.println("Base de datos y tabla creadas correctamente.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error en Driver.\n" + e);
        } catch (SQLException e) {
            System.err.println("Error en la conexión con Base de datos.\n" + e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Se ha producido un error al cerrar la conexión con la base de datos." + e);
            }
        }
    }

    public void insertData() {
        Connection connection = conexionBBDD();
        if (connection != null) {
            try {
                Random random = new Random();
                int num1 = random.nextInt(100)+1; //1 y 100
                int num2 = random.nextInt(100)+1;
                int num3 = random.nextInt(100)+1;
                int num4 = random.nextInt(100)+1;
                int num5 = random.nextInt(100)+1;
                int complementario = random.nextInt(10)+1;

                String consultaInsercion = String.format(
                        "INSERT INTO loteria (fecha, num1, num2, num3, num4, num5, complementario) " +
                                "VALUES ('2025-10-01', '%d', '%d', '%d', '%d', '%d', '%d');",
                        num1, num2, num3, num4, num5, complementario
                );

                System.out.println(consultaInsercion);
                Statement consulta = connection.createStatement();
                consulta.executeUpdate(consultaInsercion);
                System.out.println("Datos insertados correctamente");
                consulta.close();
            } catch (SQLException e) {
                System.err.println("Se ha producido un error al insertar en la base de datos.\n" + e);
            } finally {
                cerrarConexion(connection);
            }
        }
    }

    public void getData() {
        Connection connection = conexionBBDD();
        if (connection != null) {
            try {
                String consultaSeleccion = "SELECT * FROM loteria;";
                System.out.println(consultaSeleccion);
                Statement consulta = connection.createStatement();
                if (consulta.execute(consultaSeleccion)) {
                    ResultSet resultSet = consulta.getResultSet();
                    while (resultSet.next()) {
                        Loteria loteria = new Loteria(
                                resultSet.getInt("id"),
                                resultSet.getString("fecha"),
                                resultSet.getString("num1"),
                                resultSet.getString("num2"),
                                resultSet.getString("num3"),
                                resultSet.getString("num4"),
                                resultSet.getString("num5"),
                                resultSet.getString("complementario")
                        );
                        System.out.println(loteria.toString());
                    }
                }
                System.out.println("Datos recuperados correctamente");
                consulta.close();
            } catch (SQLException e) {
                System.err.println("Se ha producido un error al recuperar los datos de la base de datos.\n" + e);
            } finally {
                cerrarConexion(connection);
            }
        }
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.createDatabaseAndTable();
        db.insertData();
        db.getData();
    }
}

class Loteria {
    private int id;
    private String fecha;
    private String num1;
    private String num2;
    private String num3;
    private String num4;
    private String num5;
    private String complementario;

    public Loteria(int id, String fecha, String num1, String num2, String num3, String num4, String num5, String complementario) {
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
        return "loteria{" +
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
