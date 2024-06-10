/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Matrix;
import vista.frmDiferencia;
import vista.frmInicio;
/**
 *
 * @author Giacomo Salvador
 */
public class ControladorDiferencia {
    private frmDiferencia restar;
    private Matrix matrix;
    private Matrix matrixDiferencia;
    private Matrix matrix2;
    
    private int filas;
    private int columnas;
       
      
    public ControladorDiferencia(frmDiferencia restar, frmInicio inicio){
        this.restar = restar;
         
        
        this.restar.btnMostrar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(restar.txtFilas.getText() != null && restar.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.show(restar.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });

        this.restar.btnAleatorio.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(restar.txtFilas.getText() != null && restar.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.startRandom();
                    matrix.show(restar.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });
        
        this.restar.btnRestar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {               
                matrixDiferencia = matrix2.minus(matrix);                
                try{               
                    matrixDiferencia.show(restar.textoArea);
                    
                }catch(Exception ex){
                    
                }
            }
            
        });
        
        
        
    }
    
    
    
    //--------------------------------- Métodos --------------------------------------
    
    
    public void iniciar(){
        restar.setVisible(true);
        restar.setLocationRelativeTo(null);
        limpiarComponentes();
        
    }
    
    public void limpiarComponentes(){
        restar.txtFilas.setText("");
        restar.txtColumnas.setText("");
        restar.textoArea.setText("");
    }
    
    public void llenado(){
        try{
            filas = Integer.parseInt(restar.txtFilas.getText());
            columnas = Integer.parseInt(restar.txtColumnas.getText());
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros.");
        }   
    }

    
    public frmDiferencia getRestar() {
        return restar;
    }

    public void setRestar(frmDiferencia restar) {
        this.restar = restar;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix getMatrixDiferencia() {
        return matrixDiferencia;
    }

    public void setMatrixDiferencia(Matrix matrixDiferencia) {
        this.matrixDiferencia = matrixDiferencia;
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
