package modelo;

public class NodoDouble {
    private Double value;
    private NodoDouble next;
    private NodoDouble previous;

    public NodoDouble(Double number) {
        this.value = number;
        next = previous = null;
    }    

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public NodoDouble getNext() {
        return next;
    }

    public void setNext(NodoDouble next) {
        this.next = next;
    }

    public NodoDouble getPrevious() {
        return previous;
    }

    public void setPrevious(NodoDouble previous) {
        this.previous = previous;
    }
}
