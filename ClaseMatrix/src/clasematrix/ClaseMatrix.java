/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package clasematrix;
import modelo.Matrix;
import controlador.*;
import vista.*;


public class ClaseMatrix{
        
    public static void main(String[] args) {
        
        frmInicio inicio = new frmInicio();
        ControladorInicio contInicio = new ControladorInicio(inicio);
        
        
        contInicio.iniciar();
       
        
        
        
    }

}
