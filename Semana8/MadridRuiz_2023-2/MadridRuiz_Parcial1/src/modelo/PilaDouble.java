package modelo;

public class PilaDouble implements iPilaDouble{
    private int tamanno;
    private NodoDouble cima;
    public PilaDouble() {
        tamanno = 0;
        cima = null;
    }

    @Override
    public void push(double element) {
        NodoDouble n = new NodoDouble(element);
        n.setAnterior(cima);
        cima = n;
        tamanno++;
    }

    @Override
    public double pop() {
    if (tamanno > 0) {
        double value = cima.getDato();
        cima = cima.getAnterior();
        tamanno--;
        return value;
    } else {
        return 0.0; 
    }
}

    @Override
    public double peek() {
        return tamanno==0 ? null: cima.getDato();
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
