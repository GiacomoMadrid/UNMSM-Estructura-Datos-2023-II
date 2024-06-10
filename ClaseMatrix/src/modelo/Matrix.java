/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Matrix {
    private int M;
    private int N;
    
    private int[] cuerpo[];
    
    
    public Matrix(int M, int N){
        this.M = M;
        this.N = N;
        
        this.cuerpo = new int[M][N];
        
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                cuerpo[i][j] = 0;                
            }
        }
        
        
    }
    
    
    //--------------------------------- Métodos --------------------------------------
    
    public void startRandom(){
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){               
                cuerpo[i][j] = (int) (Math.round(Math.random()*10));
            }                       
        }
    
    }
    
    public void show(JTextArea texto){
        texto.setText("");
        for(int i=0; i<M; i++){
            texto.append("| ");
            for(int j=0; j<N; j++){
                texto.append(cuerpo[i][j]+"  ");            
            }

            texto.append(" |\n");
            
        }
        
    }
    
    public Matrix transpose(){
        Matrix matrix2 = new Matrix(N, M);
        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                matrix2.cuerpo[i][j] = cuerpo[j][i];  
                
            }            
        } 
        
        return matrix2;
        
    }
    
    public Matrix plus(Matrix matrix){  
        Matrix suma = new Matrix(M,N);
        if(M == matrix.getM() && N == matrix.getN()){                       
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    suma.cuerpo[i][j] = matrix.cuerpo[i][j] + cuerpo[i][j];  

                }            
            }

            JOptionPane.showMessageDialog(null, "Suma procesada con éxito.");
            return suma;
            
        }else{
            JOptionPane.showMessageDialog(null,"Error: Las matrices deben tener las mismas dimenciones.");
            return null; 
        }
    }
    
    public Matrix minus(Matrix matrix){
        Matrix diferencia = new Matrix(M,N);
        
        if(N == matrix.getN() && M == matrix.getM()){
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    diferencia.cuerpo[i][j] = cuerpo[i][j] - matrix.cuerpo[i][j];  

                }            
            }            
            
            JOptionPane.showMessageDialog(null, "Resta procesada con éxito.");
            return diferencia;
        
        }else{
            JOptionPane.showMessageDialog(null,"Error: Las matrices deben tener las mismas dimenciones.");
            return null;
        
        } 
        
        
    }
    
    public void equal(Matrix matrix){       
        boolean igualdad = true;
        
        if(N != matrix.getN() || M != matrix.getM()){
            igualdad = false;
        
        }else{
            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    if(cuerpo[i][j] != matrix.cuerpo[i][j]){
                        igualdad = false;
                        break;

                    }else{
                        igualdad = true;
                        
                    }
                }            
            }            
            
           
        } 

        if(igualdad == true){
            JOptionPane.showMessageDialog(null,"Las matrices a comparar son iguales");

        }else{
            JOptionPane.showMessageDialog(null,"Las matrices a comparar NO son iguales");
        }
        
    }
    
    public static Matrix identidad(int N){
        Matrix matIdentidad = new Matrix(N, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    matIdentidad.cuerpo[i][j] = 1;
                } else {
                    matIdentidad.cuerpo[i][j] = 0;
                }
            }
        }

        
        return matIdentidad;
    }
    
    
    
   //--------------------------------- Get & Set -------------------------------------- 

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int[][] getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(int[][] cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
    
    
    
    
}
