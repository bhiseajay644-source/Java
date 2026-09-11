package abstractionss.employeesalarysystem;

abstract class Employee{
    int employeeId;
    String employeeName;

    Employee(int employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
    double salary;
    FullTimeEmployee(int employeeId,String employeeName,double salary){
        super(employeeId, employeeName);
        this.salary=salary;
    }

    void calculateSalary(){
        System.out.println("Full Time Employee Salary: "+salary);
    }
}
class PartTimeSalary extends Employee{
    int hours;
    int price;
    PartTimeSalary(int employeeId,String employeeName,int hours,int price){
        super(employeeId, employeeName);
        this.hours=hours;
        this.price=price;
    }

    void calculateSalary(){
        int salary=hours*price;
        System.out.println("Part time Employee Salary: "+salary);
    }
}
public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee e;
        e=new FullTimeEmployee(101,"Ajay",45000);
        e.calculateSalary();
        e=new PartTimeSalary(102,"Sujay",10,2500);
        e.calculateSalary();
    }
}
