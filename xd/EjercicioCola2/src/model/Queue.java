/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luis
 */
public class Queue {
    private Node first;
    private Node last;
    private int size;
    
    public Queue() {
        this.first = null;
        this.last = null;
        size = 0;
    }
    
    public void insert(int value) {
        Node n = new Node(value);
        if (first==null) {
            first = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }
        size++;
    }
    public void insert(String value) {
        Node n = new Node(value);
        if (first==null) {
            first = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }
        size++;
    }
    
    public int peek() {
        if (first==null) {
            return 0;
        }
        return first.getValue();
    }
    
    public int shift() {
        if (first==null) {
            return 0;
        }
        int value = first.getValue();
        if (first==last) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
        size--;
        return value;
    }
    public String getLetter() {
        if (first==null) {
            return "";
        }
        String value = first.getLetter();
        if (first==last) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
        size--;
        return value;
    }
    public int lenght() {
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }
}
