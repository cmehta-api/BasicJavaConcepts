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
public class StringConcat {
    
    
    public static void main(String []args){
        
        int i=10;
        int j= 20;
        String s = "Selenium";
        String t = "Test";
        long l= 30;
        double d= 40;
        char c = '1';
        char c1 = 1;
        
        System.out.println("the value of i concat with J : " + i+j);
        System.out.println("the value of i and J : " + (i+j));
        System.out.println("the value of i concat with J and s: " + i+j+s);
        System.out.println("the value of i concat with J and s: " + (i+j)+s);
        System.out.println("the value of i concat with J and s and c: " + i+j+s+c);   //output :- 1020Selenium1
        System.out.println("the value of i concat with J and s and c1: " + i+j+s+c1); //output:-  1020Selenium
        
        System.out.println("the value of i concat with J and s and c1: " +i +" "+j +s +c1 +i +d  +t  +s);
        
        System.out.println("the value of i concat with J and s and c1: " +i +++j +s +c1 +i +d  +t  +s);
        
                
        
    }
    
}
