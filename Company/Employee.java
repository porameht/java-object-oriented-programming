package Company;

abstract class Employee {

    // attribute
    private String id;
    private String name;
    private Double salary;

    // static attribute
    static int minSalary = 12000;


    // default constructor
    public Employee()
    {
        System.out.println("I'm Employee");
    } 
    
    public Employee(String name, Double salary)
    {
        
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }
    
    
    // method setter
    public void setID(String id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    // method getter
    public void displayEmployee()
    {
        // System.out.println("ID = "+ this.id);
        System.out.println("Name = "+ this.name);
        System.out.println("Salary = "+ this.salary);
    }
    
    public String getName()
    {
        return this.name;
    }
    public Double getSalary()
    {
        return this.salary;
    }
    public abstract void bonus();
    

    
}