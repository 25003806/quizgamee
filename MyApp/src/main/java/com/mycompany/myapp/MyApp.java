/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myapp;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;
public class MyApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name(s): ");
        String name = sc.nextLine();
        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();
        System.out.print("What is your desired course: ");
        String desiredCourse = sc.nextLine();
        System.out.print("What is your desired varsity: ");
        String desiredVarsity = sc.nextLine();
        
        System.out.println("Your name is " + name + ", your surname is " + surname + ". You aspire to study " + desiredCourse + " at the " + desiredVarsity + ".");
        System.out.println("Welcome to MzansiApply! And we're gonna help you with your varsity applications.");    
    }
}
