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
public class WrapperClass {
    
    public static void main(String[]args){
        
        String s = "100";
        
        System.out.println("before parsing from string to int "  +s+10);
        
        //conversion from string to integer
        
        int i = Integer.parseInt(s);
        
        System.out.println("after parsing from string to int "  +(i+10));
        
        
        //conversion from string to long
        
       long l=  Long.parseLong(s);
       
        System.out.println("after parsing the string to long "  +(l+10000));
        
        
        //conversion from string to double
        
        double d =Double.parseDouble(s);
        
        System.out.println("after parsing the string to double " +(d+10.3));
        
        //conversion from string to boolean
        String flag = "true";
        boolean b= Boolean.parseBoolean(flag);
        
        System.out.println("after parsing the string to boolean " +(b));
        
        
        //conversion from string to char is not allowed
        
        
        //conversion from integer to string
        int j =100;
        String s1 = String.valueOf(j);
        System.out.println("after conversion from int to string " +s1);
               
        
    }
    
}
