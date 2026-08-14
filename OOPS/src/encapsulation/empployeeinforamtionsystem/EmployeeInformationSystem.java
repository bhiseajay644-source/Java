package encapsulation.empployeeinforamtionsystem;

import java.util.Scanner;

class Employee{
    int employeeId;
    String employeeName;
    String department;
    long salary;
    Scanner scan=new Scanner(System.in);

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    void acceptInput(){
        System.out.println("Enter the employee id:");
        setEmployeeId(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter the employee Name:");
        setEmployeeName(scan.nextLine());
        System.out.println("Enter the department:");
        setDepartment(scan.next());
        System.out.println("Enter the salary:");
        setSalary(scan.nextLong());
    }


    void display(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Department: "+department);
        System.out.println("Salary: "+salary);
        scan.close();
    }
}



public class EmployeeInformationSystem {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.acceptInput();
        e.display();

    }
}
