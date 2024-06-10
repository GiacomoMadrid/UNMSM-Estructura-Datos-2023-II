
import java.io.BufferedReader;
import java.io.FileReader;
import model.Dictionary;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Luis
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary dict1 = new Dictionary("./text1.txt");
        Dictionary dict2 = new Dictionary("./text2.txt");
    }
}
