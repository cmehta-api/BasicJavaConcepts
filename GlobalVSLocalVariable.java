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
public class GlobalVSLocalVariable {
    
    String name = "Tom"; //global variable
    int age = 25;  //global variable
    
    public static void main(String []args){
        int i=15; //local variable
        int j=20; //local variable
        GlobalVSLocalVariable obj = new GlobalVSLocalVariable();
        
        
        System.out.println("print the value of i & J " +i+" and "+j);
        System.out.println("print the name & age " +obj.name +" and " + obj.age);
        
        obj.add();
        
    }
    
    
    public void add(){
        GlobalVSLocalVariable obj = new GlobalVSLocalVariable();
        int i=11; //local variable
        int j= 21; //local variable
        
        System.out.println("print the value of i & j " +i + "and "+j);
        System.out.println("print the name & age " +obj.name +" and " +obj.age);
    }
    
}
