/*
 * Click nbfs://nbhost/SystemFileSyst em/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.justanexercise;

/**
 *
 * @author VUSANI
 */import java.util.Random;

public class JustAnExercise{
    
    public static void main(String[] args){
        
  Random rm = new Random();
  
  double num1 = rm.nextDouble(1, 2);
  double num2 = rm.nextDouble(1, 2);
  double num3 = rm.nextDouble(1, 2);
  
  System.out.println("Your first random generated number is " + num1);
  System.out.println("Your second random generated number is " + num2);
  System.out.println("Your third random generated number is " + num3);
  
  
    }
    
}