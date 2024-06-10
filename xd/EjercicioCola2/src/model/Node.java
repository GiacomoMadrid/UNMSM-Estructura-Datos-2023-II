/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luis
 */
public class Node {
    public Node prev;
    public Node next;
    private int value;
    private String letter;
    public Node(int value) {
        this.prev = null;
        this.next = null;
        this.value = value;
        letter = "";
    }
    public Node(String letter) {
        this.prev = null;
        this.next = null;
        this.value = 0;
        this.letter = letter;
    }
    public int getValue() {
        return this.value;
    }
    public String getLetter() {
        return this.letter;
    }
}
