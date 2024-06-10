import javax.swing.JOptionPane;
public class UsoListaLC {
    public static void main(String[] args) {
        ListaLC lista3=new ListaLC();
        int opcion=0,elemento;
        boolean eliminado=false;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo a la lista circular\n"+
                        "2. Eliminar un nodo de la lista circular\n"+
                        "3. Mostrar datos de la Lista circular\n"+
                        "4. Salir\n"+
                        "¿Que deseas hacer?", "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo","Agregando el Nodo a la lista circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista3.insertar(elemento);
                        break;
                    case 2:
                        if(!lista3.estaVacia()){
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo a eliminar","Eliminando Nodo de la lista circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        eliminado=lista3.eliminar(elemento);
                        if(eliminado){
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es " + elemento,
                                "Eliminando Nodos",JOptionPane.INFORMATION_MESSAGE);
                            
                        }else{
                        JOptionPane.showMessageDialog(null,"El elemento "+elemento+" no esta en la lista",
                                "Elemento no encontrado",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        }else{
                        JOptionPane.showMessageDialog(null,"No hay nodos aun",
                                "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!lista3.estaVacia()){
                            lista3.mostrarLista();
                        }else{
                        JOptionPane.showMessageDialog(null,"No hay nodos aun",
                                "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
                                "Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"La Opcion no esta en el Menu",
                                "Incorrecto",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error "+n.getMessage());
            }
            
        }while(opcion!=4);
    }
}
