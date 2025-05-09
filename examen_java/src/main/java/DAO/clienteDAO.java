package DAO;

import modelo.cliente;
import Conexion.conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clienteDAO {

    public boolean insertar(cliente cliente) {
        String sql = "INSERT INTO cliente (id, nombre, representante, correo, telefono, direccion, sector) VALUES (?, ?, ?, ?, ?, ? , ?, ?, ?)";
        try (Connection conn = Conexion.conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getid());
            stmt.setString(2, cliente.getnombre());
            stmt.setString(3, cliente.getrepresentante());
            stmt.setString(4, cliente.getCorreo());
            stmt.setBigint(5, cliente.gettelefono());
            stmt.setString(6, cliente.getdireccion());
            stmt.setEnum(7, cliente.getsector());
            
            

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println(" Error al insertar cliente: " + e.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
    }
    
}