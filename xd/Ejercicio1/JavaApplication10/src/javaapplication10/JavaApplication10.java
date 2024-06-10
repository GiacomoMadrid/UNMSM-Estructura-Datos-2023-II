package javaapplication10;

import data.Dato;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pila;

public class JavaApplication10 {

    
    public static void main(String[] args) throws FileNotFoundException {
        Pila pila = new Pila();
        
        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Dato temp = new Dato(values[0], Integer.parseInt(values[1]));
                
                pila.push(temp);
                
                //records.add(Arrays.asList(values));
            }
}       catch (IOException ex) {
            Logger.getLogger(JavaApplication10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Pila Original:");
        pila.showAll();
        Pila pilaInversa = new Pila();
        
        System.out.println("Pila Inversa:");
        while(!pila.isEmpty()){
            pilaInversa.push(pila.pop());            
        }
        pilaInversa.showAll();
        
    }
    
}
