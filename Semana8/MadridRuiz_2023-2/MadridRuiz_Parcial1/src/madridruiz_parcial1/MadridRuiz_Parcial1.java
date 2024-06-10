package madridruiz_parcial1;

import controlador.ControladorInicio;
import modelo.Operador;
import vista.frmInicio;

/**
 *
 * @author usuario
 */
public class MadridRuiz_Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operador operador = new Operador();
        frmInicio inicio = new frmInicio();
        ControladorInicio control = new ControladorInicio(inicio);
        
        control.iniciar();
    }
    
    
    



    
}
