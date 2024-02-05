/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

/**
 *
 * @author lv1822
 */
public class ClientesDTO {
    
    private int id;
    private String nombres;
    private String paterno;
    private String materno;
    private String estatus;
    
    public ClientesDTO(){}

    public ClientesDTO(int id, String nombres, String apellidoPaterno, String apellidoMaterno, String estatus) {
        
        this.id = id;
        this.nombres = nombres;
        this.paterno = apellidoPaterno;
        this.materno = apellidoMaterno;
        this.estatus = estatus;
        
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
