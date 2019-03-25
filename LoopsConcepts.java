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
public class LoopsConcepts {
    
    public static void main(String[]args){
        
        
       //for loop post increment
        int i=0;
        
        for (i=0;i<5;i++){
            System.out.println("value of i are :- " +i);
            
        }
            
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
        
        //for loop preincrement
        
        int k=0;
        int j=++k;
        
         for (j=k;j<5;j++){
            System.out.println("value of j are :- " +j);
            
        }
         
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
        
        //while loop
        
        int w=0;
        
        while(w<=5){
            
            System.out.println("print the value of w :- " +w);
            
            w++;
        }
       
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
        while(w<=10){
            
            System.out.println("print the value of w :- " +w);
            
            ++w;
        }
        
    }
    
}
