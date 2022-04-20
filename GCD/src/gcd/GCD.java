/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author Kaitlin
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCDFunction function = new GCDFunction();
        
        System.out.println("Enter the first number: ");
        function.setFirstNum(sc.nextInt());
        
        System.out.println("Enter the second number: ");
        function.setSecondNum(sc.nextInt());
        
        System.out.println("The GCD of the two numbers is: " + function.getGCD());

    }
    
}
