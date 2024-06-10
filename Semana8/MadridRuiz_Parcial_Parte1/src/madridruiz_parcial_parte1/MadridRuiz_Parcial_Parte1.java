package madridruiz_parcial_parte1;
import vista.frmInicio;
import modelo.Operador;
import controlador.ControladorInicio;

public class MadridRuiz_Parcial_Parte1 {
    
    public static void main(String[] args) {
        Operador operador = new Operador();
        frmInicio inicio = new frmInicio();
        ControladorInicio control = new ControladorInicio(inicio);
        
        control.iniciar();
        
        
    }
    
}
