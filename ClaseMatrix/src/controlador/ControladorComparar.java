/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Matrix;
import vista.frmComparar;
import vista.frmInicio;
/**
 *
 * @author Giacomo Salvador
 */
public class ControladorComparar {
    private frmComparar comparar;
    private Matrix matrix;
    private Matrix matrix2;
    
    private int filas;
    private int columnas;
       
      
    public ControladorComparar(frmComparar comparar, frmInicio inicio){
        this.comparar = comparar;
         
        
        this.comparar.btnMostrar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comparar.txtFilas.getText() != null && comparar.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.show(comparar.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });

        this.comparar.btnAleatorio.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comparar.txtFilas.getText() != null && comparar.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.startRandom();
                    matrix.show(comparar.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });
        
        this.comparar.btnComparar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {               
                matrix2.equal(matrix);                
                
            }
            
        });
        
        
        
    }
    
    
    
    //--------------------------------- Métodos --------------------------------------
    
    
    public void iniciar(){
        comparar.setVisible(true);
        comparar.setLocationRelativeTo(null);
        limpiarComponentes();
        
    }
    
    public void limpiarComponentes(){
        comparar.txtFilas.setText("");
        comparar.txtColumnas.setText("");
        comparar.textoArea.setText("");
    }
    
    public void llenado(){
        try{
            filas = Integer.parseInt(comparar.txtFilas.getText());
            columnas = Integer.parseInt(comparar.txtColumnas.getText());
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros.");
        }   
    }

    public frmComparar getComparar() {
        return comparar;
    }

    public void setComparar(frmComparar comparar) {
        this.comparar = comparar;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
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
