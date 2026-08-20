/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice;

/**
 *
 * @author VUSANI
 */
import javax.swing.JOptionPane;

public class Practice{
    
    public static void main(String[] args){
        //number 1
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        String surname = JOptionPane.showInputDialog(null, "Enter your surname: ");
        JOptionPane.showMessageDialog(null, "Hey there " + name + " " + surname + ", welcome to our area calculator!");
        //number 2
        double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your length"));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your breadth"));
        double area = length*breadth;
        JOptionPane.showMessageDialog(null, "Your area is :" + area + "m*m");
        //number 3
        
        double numberOfTiles = area/6;
        double remainderOfTiles = area%6;
        double total = numberOfTiles - numberOfTiles%1;
        JOptionPane.showMessageDialog(null,"Number of tiles =" + total + " " + "remaining space =" + remainderOfTiles + "m*m");
        //number 4
        JOptionPane.showMessageDialog(null, "Price of the whole room =" + "R" + numberOfTiles * 3.50);
        
    }
}
