/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcd;

/**
 *
 * @author Kaitlin
 */
public class GCDFunction {
    private int first;
    private int second;
    
    public void setFirstNum(int a){
        first = a;
     }
    public void setSecondNum(int b){
        second = b;
    }
    
    public int getGCD(){
        
        while (first != second) 
        if (first > second)
            first = first - second;
        else
            second = second - first;
        
       return first;
    
    }
}
       
   



    