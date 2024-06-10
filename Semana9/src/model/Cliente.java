/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author usuario
 */
public class Cliente {
    private String apellidos;
    private String nombres;
    private String telefono;
    
    public Cliente(Object[] registro) {
        this.apellidos = registro[0].toString();
        this.nombres = registro[1].toString();
        this.telefono = registro[2].toString();        
    }
    
    public Object[] getRegistro() {
        Object[] registro = {apellidos, nombres, telefono};
        return registro;
    }
    public String getNombreCompleto() {
        return apellidos + " — " + nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
