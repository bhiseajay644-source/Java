package polymorhism.employeemanagementsystem;

class Employee{
    private int employeeId;
    private String name;
    private double salary;

    Employee(int employeeId,String name,double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    void calculateWork(){
        System.out.println("Employee work calculation system...");
    }
}
class Developer extends Employee{
    private String language;

    Developer(int employeeId,String name,double salary,String language){
        super(employeeId,name,salary);
        this.language=language;
    }
    void calculateWork(){
        System.out.println("Employee Id: "+getEmployeeId());
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Language: "+language);
        System.out.println(getName()+" is developing software.");
    }
}
class Manager extends Employee{
    private int size;
    Manager(int employeeId,String name, double salary,int size){
        super(employeeId, name, salary);
        this.size=size;
    }
    void calculateWork(){
        System.out.println("Employee Id: "+getEmployeeId());
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Team size: "+size);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e;
        e=new Developer(101,"Sachin",60000.00,"java");
        e.calculateWork();
    }
}
