
import java.io.*;  

public class SingletonClass
{
    
    private static SingletonClass instance = new SingletonClass();
   
    private SingletonClass() {}
    
    public static SingletonClass getInstance() 
    {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("singleton object");   
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.showMessage();
    }
}