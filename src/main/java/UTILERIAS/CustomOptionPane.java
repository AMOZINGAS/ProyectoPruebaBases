/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILERIAS;
import DTOS.ClientesDTO;
import entidades.EmpleadoEntidad;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import persistencia.ClientesDAO;
import persistencia.ConexionBD;
import persistencia.IConexionBD;

public class CustomOptionPane {

    public void showCustomOptionPane(ClientesDTO cliente) {
        // Crear un panel para contener el botón personalizado
        IConexionBD conexionBD = new ConexionBD();
        JPanel panel = new JPanel();
        JButton customButton = new JButton("Mi Botón");
        panel.add(customButton);

        String mensaje = "ID: " + cliente.getId() + "\nNombres: " + cliente.getNombres() + "\nApellido Paterno: " + cliente.getPaterno() + "\nApellido Materno: " + cliente.getMaterno();
        
        // Mostrar el JOptionPane personalizado con el panel y un mensaje
        int result = JOptionPane.showOptionDialog(
                null,
                mensaje,
                "Detalles del Empleado",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new Object[]{"Aceptar"},
                "default");

        // Verificar la respuesta del usuario
        if (result == JOptionPane.OK_OPTION) {
            // Lógica a realizar al hacer clic en Aceptar
            EmpleadoEntidad empleado = new EmpleadoEntidad();
            empleado.setId(cliente.getId());
            empleado.setNombres(cliente.getNombres());
            empleado.setPaterno(cliente.getPaterno());
            empleado.setMaterno(cliente.getMaterno());
            
            ClientesDAO clienteModificaciones = new ClientesDAO(conexionBD);
            clienteModificaciones.eliminar(empleado);
            
            System.out.println("SE ELIMINO");
            
        } else {
            // Lógica a realizar al hacer clic en Cancelar o cerrar el diálogo
            System.out.println("Botón Cancelar o cerrar clickeado");
        }
        
    }
    
}