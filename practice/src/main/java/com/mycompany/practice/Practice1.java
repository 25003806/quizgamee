/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice;

/**
 *
 * @author VUSANI
 */
 import javax.swing.JOptionPane;

public class Practice1{
    
    public static void main(String[] args){
        
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        String surname = JOptionPane.showInputDialog(null, "Enter your surname: ");
        JOptionPane.showMessageDialog(null, "Hello there " + name + " " + surname + ", welcome to our area calculator");
        
        double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length: "));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the breadth: "));
        double area = length * breadth;
        JOptionPane.showMessageDialog(null, "The area of the room is: " + area + "m*m");
        
        double numberOfTiles = area/6;
        double remainderOfTiles = area%6;
        double total = numberOfTiles - numberOfTiles%1;
        
        JOptionPane.showMessageDialog(null, "Number of tiles = " + total + " " + "remaining space = " + remainderOfTiles + "m*m");
        JOptionPane.showMessageDialog(null, "Price of the whole room = " + "R" + numberOfTiles*3.50);
        
        
        
    }
    
    
}
