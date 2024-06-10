
package modelo;

import data.Dato;

/**
 *
 * @author usuario
 */
public class Pila {
    private int tamanno;
    private Nodo cima;
    
    public Pila(){
        this.cima = null;
        this.tamanno = 0;
    }

    public boolean isEmpty(){
        return cima == null;
    }
    
    public void push (Dato elemento){
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamanno++;
    }

    public Dato pop (){
        Dato auxiliar = cima.dato;
        cima = cima.siguiente;        
        tamanno--;
        return auxiliar;
    }

    public Dato peek(){
        return cima.dato;
    }
    
    public int size(){
        return tamanno;
    }
    
    public void clear(){
        while(!isEmpty()){
            pop();
        }
    }
    
    public void showAll(){
        Nodo aux = cima;
        while(aux != null){
            aux.dato.show();
            aux = aux.siguiente;
        }
    }
    
    //$ git config --global alias.miau '!f() { git pull && git add -A && git commit -m "$@" && git push; }; f'

    
    

}
