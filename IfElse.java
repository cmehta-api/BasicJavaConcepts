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
public class IfElse {
    
    
    public static void main(String[]args){
        
        int i=400;
        int j=500;
        int k=300;
        //int l=700;
               
        if(i>j && i>k){
            System.out.println("i is largest number");
        }else if(j>k){
            System.out.println("j is largest number");
        }else 
           System.out.println("k is largest number");    
        
    }
    
}
