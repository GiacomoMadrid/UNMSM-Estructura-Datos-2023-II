/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmInicio;
import modelo.Postre;
import modelo.Sistema;
        
        
public class ControladorInicio {
    private frmInicio frame;
    
    public ControladorInicio(frmInicio frame){
        this.frame = frame;
        
        this.frame.btnAgregarIngrediente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
            }
        });
    
    
        
        
    }

    
    
    
    public void iniciar(){
        this.frame.setLocationRelativeTo(null);
        this.frame.textoArea.setText("");
    }

}
