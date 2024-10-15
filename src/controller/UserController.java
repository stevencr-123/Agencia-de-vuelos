package controller;

import javax.swing.JOptionPane;
import model.ConexionDB;   
import model.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
public class UserController {
    //Login Method
        
   public boolean registroUsuario(String id, String nombre, String apellido, String correo, String telefono, String user, String pass) {
        ConexionDB db = new ConexionDB();
       
        boolean registrado = false;
        
        try{
           String sql = "INSERT INTO usuario (identificacion,nombre,apellido,email,telefono,us,contraseña) VALUES (?,?,?,?,?,?,?)";
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, correo);
            pst.setString(5, telefono);
            pst.setString(6, user);
            pst.setString(7, pass);

        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            registrado = true;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
    

        return registrado=true;

   }
}

