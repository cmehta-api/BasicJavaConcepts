/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaConcepts;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author cmehta
 */
public class LargestNumberInArray {
    
    public static void main(String[]args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int num = sc.nextInt();
        
        int arr[] = new int[num];
        
        System.out.println("Enter element of array");
        for (int i=0;i<num;i++){
            
            arr[i] = sc.nextInt();
            //System.out.println("value of i :- "  +arr[i]);           
        }       
        
        int max = arr[0];
        for (int j=0;j<num;j++){
            
            if(max<arr[j]){
                max = arr[j];
                //System.out.println("number is " +arr[j]);
            }
                
        }
        
        System.out.println("max number is " +max);      
        
    }
    
}
