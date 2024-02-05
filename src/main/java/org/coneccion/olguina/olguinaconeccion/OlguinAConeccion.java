/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.coneccion.olguina.olguinaconeccion;

import forms.TABLA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ClientesDAO;
import persistencia.ConexionBD;
import persistencia.IClientesDAO;
import persistencia.IConexionBD;

/**
 *
 * @author lv1822
 */
public class OlguinAConeccion {
    
    
    
    public static void main(String[] args) {
        
        IConexionBD conexionBD = new ConexionBD();
        IClientesDAO clienteDAO = new ClientesDAO(conexionBD);

        TABLA obj = new TABLA(clienteDAO);
        obj.show();
        
//        String cadenaConexion = "jdbc:mysql://localhost/ProyectoBaseAvanzada";
//        String usuario = "root";
//        String contrasenia = "Itson";
//        String codigoSQL = "SELECT * FROM empleado LIMIT 2 OFFSET 0";
//        String agregarUsuario = """
//  
//        INSERT INTO empleado (nombres, apellidoPaterno, apellidoMaterno, estatus)
//        VALUES (?,?,?,?);
//        
//                               """;
//        
//        try{
//            
//            Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
//            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
//            
//        }catch(SQLException ex){
//            
//            logger.log(Level.SEVERE, "No se pudo agregar el socio", ex);
//            
//            
////            System.out.println(ex.getMessage());
//            
//        }
//        
        //AGREGAR USUARIO
//        try{
//            Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
////            String cadenaConexion = "jdbc:mysql://localhost/club_nautico_10am";
////            String usuario = "root";
////            String contrasenia = "Itson";
////            Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
//            PreparedStatement comando = conexion.prepareStatement(agregarUsuario);
//            
//            comando.setString(1, "Francisco");
//            comando.setString(2, "Valdez");
//            comando.setString(3, "Gastelum");
//            comando.setInt(4, 0);
//            int numeroRegistrosInsertados = comando.executeUpdate();
//            logger.log(Level.INFO, "Se agregaron {0}socios", numeroRegistrosInsertados);
//                    
//        }catch(SQLException ex){
//            
//            logger.log(Level.SEVERE, "No se pudo agregar el socio", ex);
//            
//            
////            System.out.println(ex.getMessage());
//            
//        }
        
    }
}
