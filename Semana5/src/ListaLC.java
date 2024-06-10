import javax.swing.JOptionPane;
public class ListaLC {
    NodoLC ultimo;
    public ListaLC(){
        ultimo=null;
    }
    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia(){
        return ultimo==null;
    }
    //Metodo para insertar Nodos
    public ListaLC insertar(int elemento){
        NodoLC nuevo=new NodoLC(elemento);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }else{
            ultimo=nuevo;
        }
        return this;
    }
    //Metodo para mostrar la lista
    public void mostrarLista(){
        NodoLC auxiliar=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena + "["+auxiliar.dato+"]->";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, 
                "Mostrando la Lista Circular",JOptionPane.INFORMATION_MESSAGE);
    }
    //Metodo para eliminar un nodo de la lista circular
    public boolean eliminar(int elemento){
        NodoLC actual;
        boolean encontrado=false;
        actual=ultimo;
        while(actual.siguiente!=ultimo && !encontrado){
            encontrado=(actual.siguiente.dato==elemento);
            if(!encontrado){
                actual=actual.siguiente;
            }
        }
        encontrado=(actual.siguiente.dato==elemento);
        if(encontrado){
            NodoLC auxiliar=actual.siguiente;
            if(ultimo==ultimo.siguiente){
                ultimo=null;
            }else{
                if(auxiliar==ultimo){
                    ultimo=actual;
                }
                actual.siguiente=auxiliar.siguiente;
            }
            auxiliar=null;
        }
        return encontrado==true;
    }
}
