package modelo;

public class Nodo {
    private char value;
    private Nodo next;
    private Nodo previous;

    public Nodo(char number) {
        this.value = number;
        next = previous = null;
    }    

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}
