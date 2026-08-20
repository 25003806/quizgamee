/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise;

/**
 *
 * @author VUSANI
 */
public class Exercise{
    public static void main(String[] args){
       
       divide();
       double ratio = divide();
      System.out.println(ratio);  
    }
    
    public static double divide(){
        double a = 5;
        double b = 6;
        double c = (a/b);
        double d = (a%b);
        double e = c+d;
        return e;
    }
}