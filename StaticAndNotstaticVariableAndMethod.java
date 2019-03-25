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
public class StaticAndNotstaticVariableAndMethod {
    
    String name = "Tom";  //global non static variable , availabe for all functions/methods for the project
    static int age = 25; //global static variable , availabe for all functions/methods for the project
    
    
    public static void main(String[]args){
        
        StaticAndNotstaticVariableAndMethod obj = new StaticAndNotstaticVariableAndMethod();
        
        int hieght = 10; // local variable , available within this main method
        
        //Static variable can call directly , no need to craete reference object variable of main calss where as non static variable can not.
        System.out.println("the age of tom is " +age);
        
        //Static variable can call by class name , no need to craete reference object variable of main calss where as non static variable can not.
        System.out.println("the age of tom " +StaticAndNotstaticVariableAndMethod.age);
        //System.out.println("the age of tom " +StaticAndNotstaticVariableAndMethod.name); //not allowed
        
        //call the static method directly
        mail(); 
        
        //call by classname
        StaticAndNotstaticVariableAndMethod.mail();
        
        //or can call by class object reference but not recommended because unneccessary occupy the object memory
        obj.mail();
        
        
        //non static global variable access by object reference variable name 
        
        System.out.println("access non static global variable " +obj.name);
        
        //non static method access
        
        obj.sendMail();
        
        
    }
    
    public void sendMail(){
        
        System.out.println("Send the mailfrom non static method");
    }
    
    public static void mail(){
        
        System.out.println("send the mail from static method");
    }
    
    
}
