/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area;

/**
 *
 * @author VUSANI
 */import java.util.Scanner;
public class Area {
    
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       
       String name;
       String surname;
       System.out.println("Enter your name ");
       name = sc.nextLine();
       System.out.println("Enter your surname ");
       surname = sc.nextLine(); 
       
       System.out.println("Hello " + name + " " + surname + " welcome to our area calculator!");
       
       double length;
       double breadth;
       
       System.out.println("Enter length: ");
       length = sc.nextDouble();
       
       System.out.println("Enter breadth: ");
       breadth = sc.nextDouble();
       
       double area = length * breadth;
       System.out.println("The area of the shape is " + area + "m*m");
       
       double numberOfTiles = area/6;
       double remainderOfTiles = area%6;
       System.out.println("Number of tiles = " + numberOfTiles%6 + " " + "remaining space = " + remainderOfTiles + "m*m");
       
    }
}
