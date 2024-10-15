package model;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PilotoDAO {

     public List<Piloto> obtenerPiloto() {
        List<Piloto> pilotos = new ArrayList<>();
        String sql = "SELECT codigo_piloto, nombre, apellido, correo, telefono, avion FROM piloto";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String codigo = rs.getString("codigo_piloto");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String avion = rs.getString("avion");

                Piloto piloto = new Piloto(codigo, nombre, apellido, correo, telefono, avion);
                pilotos.add(piloto);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener profesores: " + e.getMessage());
        }

        return pilotos;
    }
    
    public void contratarPiloto(String nombre, String apellidos, String correo, String telefono, LocalDate fechaContratacion, String avion) {
    String codigo = generarCodigoPiloto();

    String sql = "INSERT INTO piloto (codigo_piloto, nombre, apellido, correo, telefono, fechaContratacion, avion) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection con = ConexionDB.conectar();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        pstmt.setString(1, codigo);
        pstmt.setString(2, nombre);
        pstmt.setString(3, apellidos);
        pstmt.setString(4, correo);
        pstmt.setString(5, telefono);
        pstmt.setDate(6, java.sql.Date.valueOf(fechaContratacion));
        pstmt.setString(7, avion);

        pstmt.executeUpdate();
        System.out.println("Profesor insertado con exito.");
        
    } catch (SQLException e) {
        System.err.println("Error al insertar el profesor: " + e.getMessage());
    }
}


    private String generarCodigoPiloto() {
        String codigo = "PROF001"; 
        String sql = "SELECT codigo_piloto FROM piloto ORDER BY codigo_piloto DESC LIMIT 1";  

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                String ultimoCodigo = rs.getString("codigo_piloto");
                int numero = Integer.parseInt(ultimoCodigo.substring(4));  
                numero++;
                codigo = String.format("PROF%03d", numero);
            }
        } catch (SQLException e) {
            System.err.println("Error al generar el codigo de profesor: " + e.getMessage());
        }

        return codigo;
    }
    
    
    public void eliminarPiloto(String codigoPiloto) {
        String sql = "DELETE FROM piloto WHERE codigo_piloto = ?";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, codigoPiloto);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Profesor eliminado con éxito.");
            } else {
                System.out.println("No se encontró el profesor con código: " + codigoPiloto);
            }

        } catch (SQLException e) {
            System.err.println("Error al eliminar profesor: " + e.getMessage());
        }
    }
    
}
