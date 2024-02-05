/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.EmpleadoEntidad;
import java.util.List;

/**
 *
 * @author lv1822
 */
public interface IClientesDAO {
    
    public List<EmpleadoEntidad> buscarListaTabla(int limit, int offset);

    public EmpleadoEntidad buscarPorIdEmpleado(int id);

    public EmpleadoEntidad guardar(EmpleadoEntidad empleado);

    public EmpleadoEntidad editar(EmpleadoEntidad empleado);

    public EmpleadoEntidad eliminar(EmpleadoEntidad empleado);
    
}
