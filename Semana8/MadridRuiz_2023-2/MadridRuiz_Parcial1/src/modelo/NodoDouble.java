package modelo;

public class NodoDouble {
    private Double dato;
    private NodoDouble siguiente;
    private NodoDouble anterior;

    public NodoDouble(Double number) {
        this.dato = number;
        siguiente = anterior = null;
    }    

    public Double getDato() {
        return dato;
    }

    public void setDato(Double dato) {
        this.dato = dato;
    }

    public NodoDouble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDouble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDouble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDouble anterior) {
        this.anterior = anterior;
    }
}
