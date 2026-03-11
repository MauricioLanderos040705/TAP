package com.example.practicatopicosbd.Database;

import com.example.practicatopicosbd.Algoritmos.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstudianteDAO {

    // INSERT
    public void insertarEstudiante(Estudiante estudiante) {

        String sql = "INSERT INTO estudiantes(nombre, edad) VALUES (?, ?)";

        try {

            Connection conexion = ConexionDB.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, estudiante.getNombre());
            ps.setInt(2, estudiante.getEdad());

            ps.executeUpdate();

            System.out.println("Estudiante insertado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void mostrarEstudiantes() {

        String sql = "SELECT * FROM estudiantes";

        try {

            Connection conexion = ConexionDB.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");

                System.out.println(id + " | " + nombre + " | " + edad);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizarEstudiante(Estudiante estudiante) {

        String sql = "UPDATE estudiantes SET nombre=?, edad=? WHERE id=?";

        try {

            Connection conexion = ConexionDB.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, estudiante.getNombre());
            ps.setInt(2, estudiante.getEdad());
            ps.setInt(3, estudiante.getId());

            ps.executeUpdate();

            System.out.println("Estudiante actualizado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminarEstudiante(int id) {

        String sql = "DELETE FROM estudiantes WHERE id=?";

        try {

            Connection conexion = ConexionDB.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Estudiante eliminado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}