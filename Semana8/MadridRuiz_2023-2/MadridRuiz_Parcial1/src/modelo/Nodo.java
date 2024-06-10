package modelo;

public class Nodo {
    private char dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(char dato) {
        this.dato = dato;
        siguiente = anterior = null;
    }    

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
