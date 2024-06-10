/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luis
 */
public class List {
    private Employee head;
    private Employee last;
    private int size;
    
    public List() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }
    public void append(Employee e) {
        /**
         * inserts a new Employee at the end of the list
         */
        e.next = null;
        if (head==null) {
            head = e;
            last = e;
        } else {
            Employee aux = last;
            aux.next = e;
            last = aux.next;
        }
        size++;
    }
    public int length() {
        /**
         * returns the size of the list
         */
        return size;
    }
    public boolean isEmpty() {
        /**
         * returns true if the list is empty (no elements)
         */
        return size==0;
    }
    public Employee find(String code){
        /**
         * returns the employee whose code equals to the given code in parameters
         * In case it's not found returns null
         */
        Employee aux = head;
        while (aux!=null) {
            if (aux.getCode().equals(code)) {
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
    public boolean delete(String code) {
        if (head.getCode().equals(code)) {
            head = head.next;
            size--;
            return true;
        } else {
            Employee aux = head;
            Employee aux2 = null;
            while (aux != null && !aux.getName().equals(code)) {
                aux2 = aux;
                aux = aux.next;
            }
            if (aux!=null) {
                aux2.next = aux.next;
                size--;
                return true;
            }
        }
        return false;
    }
    public void prepend(Employee e) {
        if (head == null) {
            e.next = null;
            head = e;
            last = e;
            return;
        }
        Employee aux = head;
        e.next = aux;
        head = e;
        size++;
    }
    public Employee get(int index) {
        if (index<0 || index>=size) {
            return null;
        }
        int i = 0;
        Employee aux = head;
        while (aux!=null && i!=index) {
            aux = aux.next;
            i++;
        }
        return aux;
    }
    public boolean replace(Employee e) {
        Employee aux = head;
        Employee aux2 = null;
        while (aux!=null && !aux.getCode().equals(e.getCode())) {
            aux2 = aux;
            aux = aux.next;
        }
        if (aux!=null) {
            e.next = aux.next;
            if (aux2==null) {
                if (last==head) {
                    last = e;
                }
                head = e;
            } else {
                aux2.next = e;
            }
            return true;
        }
        return false;
    }
}
