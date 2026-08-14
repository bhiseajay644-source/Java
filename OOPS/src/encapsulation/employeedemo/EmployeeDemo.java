package encapsulation.employeedemo;

class Employee{
    int employeeId;
    String employeeName;
    double salary;
    static  String companyName="OpenTech Solutions";

    void setEmployeeData(int employeeId,String employeeName,double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }
    void displayEmployee(){

        System.out.println();
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+salary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        System.out.println("Company Name: "+Employee.companyName);
        Employee e1=new Employee();

        e1.setEmployeeData(1001,"Rahul",55000.00);
        e1.displayEmployee();
        Employee e2=new Employee();
        e2.setEmployeeData(1002,"Anjali",60000.00);
        e2.displayEmployee();
    }
}
