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
public interface IEstatusDAO {
    
    public List<EmpleadoEntidad> buscarListaTabla (String filtro, int limit, int offset);
    
    public EmpleadoEntidad buscarPorIdEmpleado(int id);
    
//    public EmpleadoEntidad guardar
    
}
