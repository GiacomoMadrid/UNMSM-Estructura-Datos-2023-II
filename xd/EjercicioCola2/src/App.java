
import controller.Controller;
import model.Queue;

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
        // TODO code application logic 
        /*Queue queue = new Queue();
        Controller controller = new Controller();
        queue.insert("a");
        queue.insert("b");
        queue.insert("c");
        queue = controller.mirror(queue);
        while (!queue.isEmpty()) {
            System.out.print(queue.getLetter() + " ");
        }
        System.out.println("");*/
        Controller c = new Controller();
        c.run();
    }
    
}
