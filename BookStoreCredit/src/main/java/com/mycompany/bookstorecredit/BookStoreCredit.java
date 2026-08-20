/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookstorecredit;

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

class StudentInfo{
	
	public void markCentre(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String studentName = sc.nextLine();
		System.out.println("Enter average: ");
		double studentAverage = sc.nextDouble();
	}
}class YourStudentInfo extends StudentInfo{
	@Override
	public void markCentre(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String studentName = sc.nextLine();
		System.out.println("Enter average: ");
		double studentAverage = sc.nextDouble();
		
		System.out.println("Your name is: "+ studentName);
		System.out.println("Your average is: "+ studentAverage);
		double credit = studentAverage*10;
		System.out.println("Your credit is $"+credit);
	}
}public class BookStoreCredit{
	public static void main(String[] args){
		
	StudentInfo anyStudent = new StudentInfo();	
	YourStudentInfo myStudent = new YourStudentInfo();	
		//anyStudent.markCentre();
		myStudent.markCentre();
	}
}