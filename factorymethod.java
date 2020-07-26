import java.io.*;  
public interface Animal 
{
    void eat();    
}


public class Dog implements Animal 
{
    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }    
}

public class Cat implements Animal 
{
    @Override
    public void eat() 
    {
        System.out.println("Cat is eating");
    }   
}
public class AnimalFactory {
    
    public Animal getAnimal(String animal)
    {
        if(animal.equals(null)) 
            return null;
        
        if(animal.equalsIgnoreCase("Dog"))
        {
            return new Dog();
        } 
        else if(animal.equalsIgnoreCase("Cat"))
        {
            return new Cat();
        } 
        return null;        
    }  
}


public class Main 
{
    public static void main(String[] args) 
    {
        AnimalFactory animalFactory = new AnimalFactory();
      
        Animal animal = animalFactory.getAnimal("DOG");
        animal.eat();
      
        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.eat();
    }
}
