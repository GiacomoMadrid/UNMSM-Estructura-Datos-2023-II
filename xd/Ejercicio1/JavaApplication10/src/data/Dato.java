/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author usuario
 */
public class Dato {
    String nombre;
    int nota;

    public Dato(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public void show(){
        System.out.println(nombre + ", " + nota);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
}
