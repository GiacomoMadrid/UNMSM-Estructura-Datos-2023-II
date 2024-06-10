package modelo;


import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Postre {
    private String nombre;
    private LinkedList<String> ingredientes;
    public Postre(String nombre, LinkedList<String> ingredientes){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(LinkedList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void agregarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }
    public void eliminarIngrediente(String ingrediente){
        this.ingredientes.removeIf(cur -> cur.equals(ingrediente));
    }
    public void imprimirIngredientes(){
        System.out.println("Ingredientes:");
        for(String ingrediente: this.ingredientes){
            System.out.println("- "+ingrediente);
        }
    }
    public void imprimir(){
        System.out.println(this.nombre);
        this.imprimirIngredientes();
    }
}
