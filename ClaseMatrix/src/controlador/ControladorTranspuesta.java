/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Matrix;
import vista.frmTranspuesta;
import vista.frmInicio;
/**
 *
 * @author Giacomo Salvador
 */
public class ControladorTranspuesta {
    private frmTranspuesta transpuesta;
    private Matrix matrix;
    
    public ControladorTranspuesta(frmTranspuesta transpuesta, frmInicio inicio){
        this.transpuesta = transpuesta;         
               
        
        this.transpuesta.btnAceptar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                transpuesta.dispose();
                limpiarComponentes();
            }
            
        });
        
        
        
    }
    
    
    
    //--------------------------------- Métodos --------------------------------------
    
    
    public void iniciar(){
        transpuesta.setVisible(true);
        transpuesta.setLocationRelativeTo(null);
        limpiarComponentes();
        
    }
    
    public void limpiarComponentes(){
        transpuesta.textoArea.setText("");
    }
    
    
    public frmTranspuesta getTranspuesta() {
        return transpuesta;
    }

    public void setTranspuesta(frmTranspuesta transpuesta) {
        this.transpuesta = transpuesta;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }
    

    
    
    
}
