package modelo;


import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Sistema {
    private ArrayList<Postre>[] postres;
    public Sistema(){
        this.postres = new ArrayList[26];
        for(int i=0; i<this.postres.length; i++){
            this.postres[i] = new ArrayList();
        }
    }
    public void agregarPostre(Postre p){
        int pos = p.getNombre().charAt(0)-'A';
        this.postres[pos].add(p);
    }
    public void eliminarPostre(Postre p){
        int pos = p.getNombre().charAt(0)-'A';
        this.postres[pos].removeIf(cur -> cur.getNombre().equals(p.getNombre()));
    }
    public void imprimirPostres(){
        for(int i=0; i<postres.length; i++){
            System.out.println((char)(i+'A') + ":");
            for(Postre p: postres[i]){
                p.imprimir();
            }
        }
    }
}
