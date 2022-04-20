/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cryptogram;

import java.util.Scanner;

/**
 *
 * @author Kaitlin
 */
public class Cryptogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to find the relative frequency of its letters: ");
        String userInput = sc.next();
        char[] word = new char[userInput.length()]; 


        for(int x = 0; x < userInput.length(); x++)
            word[x] = userInput.charAt(x);

        for(int x = 0; x < word.length; x++){
            int count = 0;
            for(int y = 0; y <word.length; y++){
                if(word[x] == word[y])
                    count++;}
                String repetition = userInput.substring(0,x);
                if(!repetition.contains(String.valueOf(word[x])))
                    System.out.println("There are " + count + " instances of '" + word[x] + "'");}
    }
  }
    
    

