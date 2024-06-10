package modelo;

public class Pila implements iPila{
    private int size;
    private Nodo last;
    public Pila() {
        size = 0;
        last = null;
    }

    @Override
    public void insert(char element) {
        Nodo n = new Nodo(element);
        n.setPrevious(last);
        last = n;
        size++;
    }

    @Override
    public char pop() {
        if (size!=0) {
            char value = last.getValue();
            last = last.getPrevious();
            size--;
            return value;
        }
        return '\0';
    }

    @Override
    public char peek() {
        return size==0 ? '\0': last.getValue();
    }

    @Override
    public int lenght() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
