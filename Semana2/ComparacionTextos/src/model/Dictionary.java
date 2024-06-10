/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Luis
 */
public class Dictionary {
    private LinkedList<String>[] book;
    public Dictionary(String filePath) {
        book = new LinkedList[26];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    insertWord(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int getAscii(char letter) {
        int ascii = (int)letter;
        ascii-=97;
        if (ascii<0 || ascii>25){ 
            return 25; // special
        }
        return ascii;
    }
    private void insertWord(String word) {
        word = word.toLowerCase();
        char letter = word.charAt(0);
        int pos = Dictionary.getAscii(letter);
        if (!search(word)) {
           this.book[pos].add(word);
        }
    }
    public boolean search(String word) {
        word = word.toLowerCase();
        char letter = word.charAt(0);
        int pos = Dictionary.getAscii(letter);
        return this.book[pos].contains(word);
    }
    
}
