/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Queue;
import model.Stack;
import view.mainWindow;

/**
 *
 * @author Luis
 */
public class Controller {
    
    mainWindow view;
    public Controller() {
        view = new mainWindow();
        
        this.view.jButton2.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Queue queue = new Queue();
                String txt = view.jTextField1.getText();
                txt.
            }
        });
    }
    
    public Queue stutter(Queue queue) {
        Queue aux = new Queue();
        while (!queue.isEmpty()) {
            int num = queue.shift();
            aux.insert(num);
            aux.insert(num);
        }
        return aux;
    }
    public Queue mirror(Queue queue) {
        Queue aux = new Queue();
        Stack stack = new Stack();
        while(!queue.isEmpty()) {
            String x = queue.getLetter();
            stack.insert(x);
            aux.insert(x);
        }
        while(!stack.isEmpty()) {
            aux.insert(stack.get());
        }
        return aux;
    }
    
    public void run() {
        view.setVisible(true);
    }
}
