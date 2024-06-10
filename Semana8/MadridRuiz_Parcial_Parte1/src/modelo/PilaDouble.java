package modelo;

public class PilaDouble implements iPilaDouble{
    private int size;
    private NodoDouble last;
    public PilaDouble() {
        size = 0;
        last = null;
    }

    @Override
    public void insert(Double element) {
        NodoDouble n = new NodoDouble(element);
        n.setPrevious(last);
        last = n;
        size++;
    }

    @Override
    public Double pop() {
        if (size!=0) {
            Double value = last.getValue();
            last = last.getPrevious();
            size--;
            return value;
        }
        return null;
    }

    @Override
    public Double peek() {
        return size==0 ? null: last.getValue();
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
