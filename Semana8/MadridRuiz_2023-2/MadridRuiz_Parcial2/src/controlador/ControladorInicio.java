package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Heapsort;
import vista.frmInicio;

public class ControladorInicio {
    frmInicio frame;
    Heapsort hsort;
    int indice;
    
    public ControladorInicio(frmInicio frame){
        this.frame = frame;
        
        this.frame.btnAleatorio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    indice = Integer.parseInt(frame.txtNumeroElementos.getText());
                    hsort = new Heapsort(indice);                  
                    hsort.sortRandom(frame.txtAleatorio, frame.txtElementos);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ingrese Datos válidos en cada apartado.");
                }
                
            }
        });
        
        this.frame.btnManual.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 try{
                    indice = Integer.parseInt(frame.txtNumeroElementos.getText());
                    hsort = new Heapsort(indice);                  
                    hsort.heapsort(frame.txtAleatorio, frame.txtElementos);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ingrese Datos válidos en cada apartado.");
                }
            }
        });
        
        
    }
    
    public void iniciar(){
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
        
        
    }
    
    
    
}
