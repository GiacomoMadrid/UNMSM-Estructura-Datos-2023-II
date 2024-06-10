package madridruiz_parcial2;
import modelo.Heapsort;
import vista.frmInicio;
import controlador.ControladorInicio;

public class MadridRuiz_Parcial2 {

    
    public static void main(String[] args) {
        frmInicio inicio = new frmInicio();
        ControladorInicio control = new ControladorInicio(inicio);
        
        control.iniciar();
    
        
    }
}
