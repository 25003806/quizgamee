/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.signupsystem;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

public class SignupSystem{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the sign-up page!");
		
		System.out.println("Enter your username: ");
		String userName = sc.nextLine();
		
		System.out.println("Enter your password: ");
		String userPassword = sc.nextLine();
		
		System.out.println("Your username and password have been saved. Welcome to hell bro.");
		
		System.out.println("Enter your username: ");
		String userName1 = sc.nextLine();
		
		System.out.println("Enter your password: ");
		String userPassword1 = sc.nextLine();
		
		if(userName == userName1 && userPassword == userPassword1){
			
			System.out.println("Welcome " + userName);
			
			
		}else{
			
			System.out.println("Username or password is wrong! Please try again");
			
		}
		
	} 
	
}