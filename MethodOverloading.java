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
public class MethodOverloading {
    
    //Method overlaoding = same method name with different input parameert & also different data type in same class
    //main method can be overlaoded in same class
    //Same method name with same input parameter with same input data type are not allowed in same class
    
    public static void main(String[] args){
        
        System.out.println("Main method with string args");
        
        MethodOverloading obj = new MethodOverloading();
        obj.main();
        obj.add();
        obj.add("selenium");
        obj.add('c');
        obj.add(10.89);
        obj.add(10);
        obj.add("test", null);
        obj.add(16, 20);
        obj.add(null, 1, 16.9, 'd', 1818);
        
        
        
    }
    
    
    public static void main(int i ){    //main method can be overlaoded
      
        
        System.out.println("main method with 0 input parameter");
    }
    
    public static void main(String i){   //main method can be overlaoded
        
      System.out.println("main method with string input parameter");  
    }
    
    
    public void main(){     //main method can be overlaoded
      
        System.out.println("non static main method with 0 input parameter");
        
    }
    
    
    
    
    public void add(){
        
        System.out.println("add method with zero parameter"); 
    }
    
    public void add(int i){
        
        System.out.println("add method with one int parameter");
        System.out.println(i);
    }
    
    public void add(int i , int j){
        
        System.out.println("add method with two int parameters"); 
        System.out.println(i+j);
    }
    
    public void add(String i){
        
        System.out.println("add method with one string  parameter"); 
        System.out.println(i);
    }
    
    public void add(String i , String j){
        
        System.out.println("add method with two string  parameters"); 
        System.out.println(i+j);
    }
    
    public void add(char c){
        
        System.out.println("add method with one char parameter"); 
        System.out.println(c);
    }
    
    public void add(double d){
        
        System.out.println("add method with one double parameter"); 
        System.out.println(d);
    }
    
    public void add(double d , double d1){
        
        System.out.println("add method with two double parameters"); 
        System.out.println(d+d1);
    }
    
    public void add(String s , int i , double d, char c,long l){
        
        System.out.println("add method with all parameter"); 
        
        System.out.println(s+i+d+c+l);
    }
    
    
}
