package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static final String host = "jdbc:mysql://localhost:3306/operador_actividades";
    private static final String db = "operador_actividades";
    private static final String url = host + db;
    private static final String user = "campus2023";
    private static final String password = "campus2023"; 

    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;
    }
}