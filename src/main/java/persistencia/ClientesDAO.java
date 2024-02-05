/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.EmpleadoEntidad;
import forms.Agregar;
import forms.TABLA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lv1822
 */
public class ClientesDAO implements IClientesDAO{

    private IConexionBD conexionBD;

    public ClientesDAO(IConexionBD conexionBD) {
        
        this.conexionBD = conexionBD;
        
    }
    
    @Override
    public List<EmpleadoEntidad> buscarListaTabla(int limit, int offset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntidad buscarPorIdEmpleado(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntidad guardar(EmpleadoEntidad empleado) {
        
        Logger logger = Logger.getLogger(ClientesDAO.class.getName());
        String cadenaConexion = "jdbc:mysql://localhost/ProyectoBaseAvanzada";
        String usuario = "root";
        String contrasenia = "amosmysql";
        String agregarUsuario = """
        INSERT INTO empleado (nombres, apellidoPaterno, apellidoMaterno, estatus)
        VALUES (?,?,?,?);
        """;
        try{
            Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
//            String cadenaConexion = "jdbc:mysql://localhost/club_nautico_10am";
//            String usuario = "root";
//            String contrasenia = "Itson";
//            Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
            PreparedStatement comando = conexion.prepareStatement(agregarUsuario);
            
            comando.setString(1, empleado.getNombres());
            comando.setString(2, empleado.getPaterno());
            comando.setString(3, empleado.getMaterno());
            comando.setInt(4, 0);
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0}socios", numeroRegistrosInsertados);
                    
        }catch(SQLException ex){
            
            logger.log(Level.SEVERE, "No se pudo agregar el socio", ex);
            
            
//            System.out.println(ex.getMessage());
            
        }
        
        return empleado;
        
    }

    @Override
    public EmpleadoEntidad editar(EmpleadoEntidad empleado) {
        
        String cadenaConexion = "jdbc:mysql://localhost/ProyectoBaseAvanzada";
        String usuario = "root";
        String contrasenia = "amosmysql";
        
        
        System.out.println(empleado.getNombres());
        System.out.println(empleado.getId());
        System.out.println(empleado.getPaterno());
        System.out.println(empleado.getMaterno());
        
        // ID del registro que deseas actualizar
        int idRegistro = empleado.getId(); // Reemplaza con el ID adecuado
        
        try (Connection connection = DriverManager.getConnection(cadenaConexion, usuario, contrasenia)) {
            // Consulta SQL de actualización
            String sql = "UPDATE empleado SET nombres = ?, apellidoPaterno = ?, apellidoMaterno = ? WHERE id = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Asigna valores a los parámetros
                statement.setString(1, empleado.getNombres());
                statement.setString(2,empleado.getPaterno());
                statement.setString(3, empleado.getMaterno());
                statement.setInt(4, idRegistro);

                // Ejecuta la consulta de actualización
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Registro actualizado exitosamente.");
                } else {
                    System.out.println("No se encontró el registro para actualizar.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return empleado;
    }

    @Override
    public EmpleadoEntidad eliminar(EmpleadoEntidad empleado) {
        // Detalles de la conexión a la base de datos
        String cadenaConexion = "jdbc:mysql://localhost/ProyectoBaseAvanzada";
        String usuario = "root";
        String contrasenia = "amosmysql";
        
        
        // ID del registro que deseas actualizar
        int idRegistro = empleado.getId(); // Reemplaza con el ID adecuado

        
        try (Connection connection = DriverManager.getConnection(cadenaConexion, usuario, contrasenia)) {
            // Consulta SQL de actualización
            String sql = "UPDATE empleado SET estatus = ? WHERE id = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Asigna valores a los parámetros
                statement.setString(1, "0");
                statement.setInt(2, idRegistro);

                // Ejecuta la consulta de actualización
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Registro actualizado exitosamente.");
                } else {
                    System.out.println("No se encontró el registro para actualizar.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return empleado;
        
    }

    
    
}
