package polymorhism.employeemanagementsyste;

class Employee{
    int employeeId;
    String employeeName;
    double salary;

    Employee(int employeeId, String employeeName, double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }
}
class Department extends Employee{
    String department;
    Department(int employeeId,String employeeName,double salary,String department){
        super(employeeId, employeeName, salary);
        this.department=department;
    }
    void displayDetails(){
        System.out.println("Department Details: ");
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
        System.out.println();
    }
}
class Bonus extends Employee{
    double bonus;
    Bonus(int employeeId,String employeeName,double salary,String department,double bonus){
        super(employeeId, employeeName, salary);
        this.bonus=bonus;
    }
    void displayDetails(){
        double totalSalary=bonus+salary;
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+totalSalary);
    }
}
 class EmployeeManagementSystem {
     public static void main(String[] args) {
         Department d=new Department(101,"Ajay",55000.00,"IT");
         d.displayDetails();
     }
}
