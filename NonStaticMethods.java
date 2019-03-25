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
public class NonStaticMethods {
    
    public static void main (String []args){
        
        NonStaticMethods obj  = new NonStaticMethods();
       
        
        System.out.println(obj.add());
        System.out.println(obj.div(10.99, 22.22));
        System.out.println(obj.mul(10, 20));
        System.out.println(obj.qa("Elenium"));
        obj.sample();
        
        
    }
    
    //no input parameter but some output
    public int add(){
        
        System.out.println("Addition of two number");
        int i=10;
        int j=20;
        int k= i+j;
        return k;
    }
    
    //no input parameter no output
    
    public void sample(){
        System.out.println("no input no output");
    }
    
    //input parameter and output
    
    public double div(double x, double y){
        
        System.out.println("division value of two numbers");
        return x%y;
    }
    
    //input parameter and output
    
    public long mul(long x, long y){
        
        System.out.println("mul value of two numbers");
        return x*y;
    }
    
    public String qa(String x){
        
        System.out.println("print the string");
        return x;
    }
    
    
    
    
}
