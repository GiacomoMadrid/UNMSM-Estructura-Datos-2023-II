/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Luis
 */

import java.util.Scanner;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // si un numero es positivo o negativo
        Scanner input = new Scanner(System.in);
        // determinar si un numero es par o impar, ademas si es positivo o negativo
        System.out.println("Ingresa N: ");
        int n = input.nextInt();
        int a = 20; // darle un valor
        
        if (n>0) {
            System.out.println("Positivo");
        } else if (n == 0) { // comparar
            System.out.println("Neutro");
        } else {
            System.out.println("Negativo");
        }
        
        if (n%2 == 0) { 
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
    
}
