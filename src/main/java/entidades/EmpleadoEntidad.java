/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeradores.AccionCatalogoEnumerador;

/**
 *
 * @author lv1822
 */
public class EmpleadoEntidad {
    
    private int id;
    private String nombres;
    private String paterno;
    private AccionCatalogoEnumerador tipo;
    private String materno;
    private String estatus;
    
    public EmpleadoEntidad(){}

    public EmpleadoEntidad(String nombres, String apellidoPaterno, String apellidoMaterno, String estatus) {
        
        this.nombres = nombres;
        this.paterno = apellidoPaterno;
        this.materno = apellidoMaterno;
        this.estatus = estatus;
        
    }
    
    public EmpleadoEntidad(int id, String nombres, String apellidoPaterno, String apellidoMaterno, String estatus) {
        
        this.id = id;
        this.nombres = nombres;
        this.paterno = apellidoPaterno;
        this.materno = apellidoMaterno;
        this.estatus = estatus;
        
    }
    
    public EmpleadoEntidad(int id, String nombres, String apellidoPaterno, AccionCatalogoEnumerador tipo, String apellidoMaterno, String estatus) {
        
        this.id = id;
        this.nombres = nombres;
        this.tipo = tipo;
        this.paterno = apellidoPaterno;
        this.materno = apellidoMaterno;
        this.estatus = estatus;
        
    }

    public AccionCatalogoEnumerador getTipo() {
        return tipo;
    }

    public void setTipo(AccionCatalogoEnumerador tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
}
