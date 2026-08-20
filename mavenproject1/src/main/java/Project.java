/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VUSANI
 */import java.util.Random;
 
public class Project {
    public static void main(String[] args){
        
        Random rm = new Random();
        
        int number = rm.nextInt(1, 9);
        
        System.out.println("Your user generated number is " + number);
        
    }
    
}
