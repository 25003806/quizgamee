/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divide;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

public class Divide{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        
        double answer = num1/num2;
        
        System.out.println("The answer is: " + answer);
        
        
    }
}