package modelo;

public class Pila implements iPila{
    private int tamanno;
    private Nodo cima;
    public Pila() {
        tamanno = 0;
        cima = null;
    }

    @Override
    public void push(char element) {
        Nodo n = new Nodo(element);
        n.setAnterior(cima);
        cima = n;
        tamanno++;
    }

    @Override
    public char pop() {
        if (tamanno!=0) {
            char value = cima.getDato();
            cima = cima.getAnterior();
            tamanno--;
            return value;
        }
        return '\0';
    }

    @Override
    public char peek() {
        return tamanno==0 ? '\0': cima.getDato();
    }

    @Override
    public int lenght() {
        return tamanno;
    }

    @Override
    public boolean isEmpty() {
        return tamanno==0;
    }
}
