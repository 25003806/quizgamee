/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise.java;

/**
 *
 * @author VUSANI
 */

import java.util.Scanner;

public class ExerciseJava {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("1. Check Balance");
       System.out.println("2. Deposit");
       System.out.println("3. Withdraw money");
       System.out.println("Enter 1,2 or 3");
       
       double deposit;
       double balance = 500;
       double currentBalance;
       double withdrawal;
       double remainder;
       
       
       int choice = sc.nextInt();
       
       if(choice == 1 || choice == 2 || choice == 3){
       if(choice == 1){
           System.out.println("Balance is $500");
       }else if(choice == 2){
           System.out.println("Enter any amount from 0: ");
           deposit = sc.nextDouble();
           if(deposit<0){
               System.out.println("Enter a valid number: ");
           }else{
               currentBalance = balance + deposit;
               System.out.println("Now the balance is " + currentBalance);
           }
       }else {
             System.out.println("How much withdraw: ");
             withdrawal = sc.nextDouble();
             if(withdrawal > 0 && withdrawal <= currentBalance){
                 remainder = currentBalance - withdrawal;
             }

       }
                        
                    }


           }
}