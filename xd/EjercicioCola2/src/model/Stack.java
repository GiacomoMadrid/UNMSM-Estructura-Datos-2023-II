/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luis
 */
public class Stack {
    private Node last;
    private int size;
    
    public Stack() {
        this.last = null;
    }
    
    public void insert(int value) {
        Node n = new Node(value);
        n.prev = last;
        last = n;
        size++;
    }
    public void insert(String value) {
        Node n = new Node(value);
        n.prev = last;
        last = n;
        size++;
    }
    public int pop() {
        if (size!=0) {
            int value = last.getValue();
            last = last.prev;
            size--;
            return value;
        }
        return 0;
    }
    public String get() {
        if (size!=0) {
            String value = last.getLetter();
            last = last.prev;
            size--;
            return value;
        }
        return "";
    }
    
    public int peek() {
        return isEmpty() ? 0 : last.getValue();
    }
    
    public int lenght() {
        return size;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
}
