nb /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bar;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

public class Bar{
    public static void main(String[] args){
        
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Are you a student?(true/false)");
     boolean student = sc.nextBoolean();
     
     if(student){
         
         System.out.println("Are you older than 18?(true/false)");
         boolean age = sc.nextBoolean();
         
         if(age){
             System.out.println("You are allowed to get into the bar");
         }else{
             System.out.println("No entry");
         }
         
     }else{
         System.out.println("No entry into the bar.");
     }
        
        
        
    }
}