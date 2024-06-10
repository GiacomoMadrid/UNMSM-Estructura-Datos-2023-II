package view.ListasDobles;


public class Nodo {
    public int dato;
    public Nodo siguiente;
    public Nodo anterior;
    public String codigo;
    public String nombre;
    public String apellidos;
    public String sexo;
    public float sueldo;
    public Nodo(int el){
        this(el,null,null);
    }
    public Nodo(int el, Nodo s, Nodo a){
        dato=el;
        siguiente=s;
        anterior=a;
    }

    public Nodo(String codigo, String nombre, String apellidos, String sexo, float sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.sueldo = sueldo;
        siguiente = anterior = null;
    }
    
    
}