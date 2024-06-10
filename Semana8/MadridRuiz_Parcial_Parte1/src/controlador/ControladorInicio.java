package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmInicio;
import modelo.Operador;

public class ControladorInicio {
    protected frmInicio frame;
    private Operador operador;
    
    public ControladorInicio(frmInicio frame){
        this.frame = frame;
        this.operador = new Operador();
        
        this.operador.setExpresion(this.frame.txtInfija.getText());
        
        this.frame.btnProcesar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                operador.setExpresion(frame.txtInfija.getText());
                
                System.out.println(operador.getExpresion());
                
                if(operador.setExpresionPre() == true){
                frame.txtPrefija.setText(operador.getExpresionPre());
                
                System.out.println(operador.getExpresionPre());
                double resultado = operador.solvePrefix(operador.getExpresionPre());
                frame.txtRespuesta.setText(""+resultado);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        });
        
       
        
        
        
        
        
        
    }
    
    public void iniciar(){
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
        limpiarControladores();
       
    }
    
    public void limpiarControladores(){
        this.frame.txtInfija.setText("");
        this.frame.txtPrefija.setText("");
        this.frame.txtRespuesta.setText("");
    }
    
    
}
