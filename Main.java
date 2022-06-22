public class Main {
    public static void main(String [] args){

        //create object
        Employee e1 = new Employee(); 
        // set by method
        e1.setID("1");
        e1.setName("Porameht");
        e1.setSalary(30002.2);
        
        // get by method
        e1.displayEmployee();
        
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());




        //create object
        Employee e2 = new Employee(); 
        // set by method
        e2.setID("2");
        e2.setName("Parichad");
        e2.setSalary(50800.2);
        // get by method
        e2.displayEmployee();
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

        
    }

}