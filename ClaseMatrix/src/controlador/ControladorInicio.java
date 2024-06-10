
package controlador;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.Matrix;
import static modelo.Matrix.identidad;
import vista.*;
/**
 *
 * @author Giacomo Salvador
 */
public class ControladorInicio {
    private frmInicio inicio;
    private Matrix matrix;
    private int filas;
    private int columnas;
    
    protected frmSuma frameSuma = new frmSuma();
    private ControladorSuma contSuma = new ControladorSuma(frameSuma, inicio);
    
    protected frmDiferencia frameDiferencia = new frmDiferencia();
    private ControladorDiferencia contDiferencia = new ControladorDiferencia(frameDiferencia, inicio);
    
    protected frmComparar frameComparar = new frmComparar();
    private ControladorComparar contComparar = new ControladorComparar(frameComparar, inicio);
    
    protected frmTranspuesta frameTranspueta = new frmTranspuesta();
    private ControladorTranspuesta contTranspuesta = new ControladorTranspuesta(frameTranspueta, inicio);
    
    public ControladorInicio (frmInicio inicio){
        this.inicio = inicio;
        this.inicio.setIconImage(getIconImage());
        
        this.inicio.btnMostrar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.txtFilas.getText() != null && inicio.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.show(inicio.textoArea);
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });

        this.inicio.btnAleatorio.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.txtFilas.getText() != null && inicio.txtColumnas.getText() != null){
                    llenado();
                    limpiarComponentes();
                    matrix = new Matrix(filas, columnas);
                    matrix.startRandom();
                    matrix.show(inicio.textoArea);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores enteros");
                }
            }
            
        });
        
        this.inicio.btnSuma.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(matrix != null){
                    contSuma.setMatrix2(matrix);
                    contSuma.iniciar();
                    contSuma.getSumar().setIconImage(getIconImage());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, inicialice una matriz antes de continuar.");
                }
            }
            
        });
        
        this.inicio.btnDiferencia.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(matrix != null){
                    contDiferencia.setMatrix2(matrix);
                    contDiferencia.iniciar();
                    contDiferencia.getRestar().setIconImage(getIconImage());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, inicialice una matriz antes de continuar.");
                }
            }
            
        });
        
        this.inicio.btnComparar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(matrix != null){
                    contComparar.setMatrix2(matrix);
                    contComparar.iniciar();
                    contComparar.getComparar().setIconImage(getIconImage());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, inicialice una matriz antes de continuar.");
                }
            }
            
        });
        
        this.inicio.btnTranspuesta.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(matrix != null){
                    contTranspuesta.setMatrix(matrix.transpose());
                    contTranspuesta.iniciar();
                    contTranspuesta.getMatrix().show(contTranspuesta.getTranspuesta().textoArea);
                    contTranspuesta.getTranspuesta().setIconImage(getIconImage());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, inicialice una matriz antes de continuar.");
                }
            }
            
        });
        
        this.inicio.btnIdentidad.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión de la Matriz"));
                    Matrix matrixIdentidad = matrix.identidad(N);
                    matrixIdentidad.show(inicio.textoArea);
                    matrix = matrixIdentidad;
                    
                }catch(HeadlessException | NumberFormatException ex){
                
                }
                
            }
            
        });
    
    }
    
    //--------------------------------- Métodos --------------------------------------
    
    
    public void iniciar(){
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        limpiarComponentes();
        
    }
    
    public void limpiarComponentes(){
        inicio.txtFilas.setText("");
        inicio.txtColumnas.setText("");
        inicio.textoArea.setText("");
    }
    
    public void llenado(){
        try {       
            filas = (int) Integer.parseInt(inicio.txtFilas.getText());
            columnas = (int) Integer.parseInt(inicio.txtColumnas.getText());
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros.");
        }   

    }
    
    public Image getIconImage(){
        Image redValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.png"));
        return redValue;
    }    
    
    
    //--------------------------------- Get & Set --------------------------------------

    public frmInicio getInicio() {
        return inicio;
    }

    public void setInicio(frmInicio inicio) {
        this.inicio = inicio;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
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
