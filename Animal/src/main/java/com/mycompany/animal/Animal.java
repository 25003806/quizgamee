public class Animal{
    public void makeSound(){
        
        System.out.println("Makes sound.");
        
    }
 
class Cat extends Animal{
    @Override
    public void makeSound(){
        
        System.out.println("Meow!");
        
    }
}

    
    public static void main(String[] args){
        
        Animal anyAnimal = new Animal();
        
        
        anyAnimal.makeSound();
        
        
    }
}
  
