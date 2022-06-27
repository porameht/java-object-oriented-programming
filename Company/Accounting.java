package Company;

public class Accounting extends Employee
{
    public String skill="manage money";

    public Accounting(String name, Double salary) 
    {
        super(name, salary);
        System.out.println("I'm accounting");
    }

    // override
    public void bonus()
    {
        
    }

    
}
