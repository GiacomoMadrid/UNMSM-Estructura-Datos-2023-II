/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Matrix;
import vista.frmSuma;
import vista.frmInicio;
/**
 *
 * @author Giacomo Salvador
 */
public class ControladorSuma {
    private frmSuma sumar;
    private Matrix matrix;
    private Matrix matrixSuma;
    private Matrix matrix2;
    
    private int filas;
    private int columnas;
       
      
    public ControladorSuma(frmSuma sumar, frmInicio inicio){
        this.sumar = sumar;
         
        
        this.sumar.btnMostrar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sumar.txtFilas.getText() != null && sumar.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.show(sumar.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });

        this.sumar.btnAleatorio.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sumar.txtFilas.getText() != null && sumar.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.startRandom();
                    matrix.show(sumar.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });
        
        this.sumar.btnSumar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {               
                matrixSuma = matrix2.plus(matrix);                
                try{               
                    matrixSuma.show(sumar.textoArea);
                                        
                }catch(Exception ex){
                    
                }
            }
            
        });
        
        
        
    }
    
    
    
    //--------------------------------- Métodos --------------------------------------
    
    
    public void iniciar(){
        sumar.setVisible(true);
        sumar.setLocationRelativeTo(null);
        limpiarComponentes();
        
    }
    
    public void limpiarComponentes(){
        sumar.txtFilas.setText("");
        sumar.txtColumnas.setText("");
        sumar.textoArea.setText("");
    }
    
    public void llenado(){
        try{
            filas = Integer.parseInt(sumar.txtFilas.getText());
            columnas = Integer.parseInt(sumar.txtColumnas.getText());
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros.");
        }   
    }

    public frmSuma getSumar() {
        return sumar;
    }

    public void setSumar(frmSuma sumar) {
        this.sumar = sumar;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix getMatrixSuma() {
        return matrixSuma;
    }

    public void setMatrixSuma(Matrix matrixSuma) {
        this.matrixSuma = matrixSuma;
    }

    public Matrix getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(Matrix matrix2) {
        this.matrix2 = matrix2;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    
    
    
    
}
