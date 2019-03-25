/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaConcepts;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cmehta
 */
public class SortingArrayElements {
    
    public static void main(String[]args){
        
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array elements");
        int num = sc.nextInt();
        int arr[] = new int[num]; 
        
        for(int i=0;i<num;i++){
          
          //enter the integer elements  
              
          arr[i] = sc.nextInt();
          //System.out.println("Print the number "  +arr[i]);         
        } 
        
            Arrays.sort(arr);
          
            for(int j=0;j<num;j++){
              
            System.out.println("sorting number are: " +arr[j]);
          }        
    }
    
}
