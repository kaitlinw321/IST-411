/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;

import java.util.Scanner;

/**
 *
 * @author Kaitlin
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromesFunction PF = new PalindromesFunction();
        
        
        System.out.println("Enter a string with 5 or less characters to check if it is a palindrome: ");
        String word = sc.next();
        
        if(word.length()<=5){
            PF.setUserInput(word);
            System.out.println(PF.getUserInput());
                    }
        else
            System.out.println("Your input is greater than 5 characters long.");
        
        
        
    }
    
}
