package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conexion = null;
    private static final String DB = "carro_db";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "password";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB;

    public Conexion() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASS);
            if (conexion != null) {
                System.out.println("¡Conexión exitosa!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conectó: " + e);
        }
    }

    public Connection conectar() {
        return conexion;
    }

    public void desconectar() {
        conexion = null;
        if (conexion == null) {
            System.out.println("Desconectado");
        }
    }

}
