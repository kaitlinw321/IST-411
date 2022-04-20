/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromes;

/**
 *
 * @author Kaitlin
 */
public class PalindromesFunction {
    private String UserInput;
    private String opposite = "";
    
    public void setUserInput(String num){
            UserInput = num;
        }
    
    public String getUserInput(){
        int checkLength = UserInput.length();
        
        for (checkLength= checkLength-1;checkLength>=0;checkLength--){
            opposite=opposite + UserInput.charAt(checkLength);
        }
        if (opposite.equalsIgnoreCase(UserInput)){
            System.out.println(UserInput + " is a palindrome");
            }
        else {
            System.out.println(UserInput + " is not a palindrome");
            }    
        return UserInput;
    }
}
    
   
            
        
    
