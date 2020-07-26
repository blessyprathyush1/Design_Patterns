import java.io.*;  


public interface State 
{
    public void doAction(Context context);
}


public class Context
{
    private State state;
    
    public Context() 
    {
        state = null;
    }
    
    public void setState(State state) 
    {
        this.state = state;
    }
    
    public State getState() 
    {
        return state;
    }
}


public class ApplicationStart implements State 
{

    @Override
    public void doAction(Context context)
    {
        System.out.println("The application is in the starting state of development.");
        context.setState(this);
    }
    public String toString()
    {
        return "Starting state.";
    }
}

public class ApplicationFinish implements State 
{

    @Override
    public void doAction(Context context) 
    {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }
    public String toString() 
    {
        return "Finished state.";
    }    
}


public class Main 
{
    public static void main(String[] args) 
    {
        Context context = new Context();
        
        ApplicationStart start = new ApplicationStart();
        start.doAction(context);
        
        System.out.println(context.getState());
        
        ApplicationFinish finish = new ApplicationFinish();
        finish.doAction(context);
        
        System.out.println(context.getState());
    }
}