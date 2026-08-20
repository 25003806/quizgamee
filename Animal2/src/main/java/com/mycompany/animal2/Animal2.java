/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal2;

/**
 *
 * @author VUSANI
 */
public class Animal2{
    public void makeSound(){
        
        System.out.println("Makes sound.");
        
    }
 
class Cat extends Animal2{
    @Override
    public void makeSound(){
        
        System.out.println("Meow!");
        
    }
}

    
    public static void main(String[] args){
        
        Animal2 anyAnimal = new Animal2();
        
        
        anyAnimal.makeSound();
        
        
    }
}
  
