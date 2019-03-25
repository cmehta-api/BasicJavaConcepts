/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaConcepts;

/**
 *
 * @author cmehta
 */
public class TwoDArrayConcepts {
    
    public static void main(String[]args){
        
         Object t[][] = new Object[2][3];  //2d program with object data type
    
         t[0][0] = 1; 
         t[0][1] = 'c';
         t[0][2] = "Selenium"; 
         
         t[1][0] = 1.44; 
         t[1][1] = 89767;
         t[1][2] = '$';
         
         //System.out.println("print the value of t[0][0] :- " +t[0][0]);
         
         
         //print all values
         System.out.println("size of row " +t.length); 
         System.out.println("size of col " +t[0].length );
         
         for (int row =0;row<t.length;row++){
             for(int col = 0; col<t[0].length;col++){
                 
                 System.out.println(t[row][col]); //print all value
             }
             
         }
         
         
         System.out.println("**************************************************");
         
         
         //2d array by using String
         
         String s[][] = new String[3][3];
         
         s[0][0] = "Selenium";
         s[0][1] = "Testing";
         s[0][2] = "is";
         
        
         s[1][0] = "Fun";
         s[1][1] = "2019";
         s[1][2] = "2020";
         
         s[2][0] = "Happy";
         s[2][1] = "New";
         s[2][2] = "Year";
         
         
         //System.out.println("print the value of s[2][2]  " + s[2][4]);
         
         for(int row = 0;row<s.length;row++){
             for(int col = 0;col<s[0].length;col++){
                 
                 System.out.println("print the value  " +s[row][col]);
             }
             
         }
         
         
         
         
    }
    
      
}
