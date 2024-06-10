
import modelo.Postre;
import modelo.Sistema;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Usuario
 */
public class CRUDPostres {

    public static void main(String[] args) {
        
        String nombre1 = "Pie";
        LinkedList<String> ingredientes1 = new LinkedList<String>();
        ingredientes1.add("Harina");
        ingredientes1.add("Manzana");
        
        Postre p = new Postre(nombre1, ingredientes1);
        //p.imprimir();
        p.eliminarIngrediente("Harina");
        //p.imprimir();
        p.agregarIngrediente("Azucar");
        //p.imprimir();
        
        Sistema s = new Sistema();
        s.agregarPostre(p);
        s.imprimirPostres();
    }
}
