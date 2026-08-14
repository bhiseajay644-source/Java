package encapsulation.employeeaccessandpermission;

import java.util.Scanner;

class Employee{
    private int employeeId;
    private int accessCode;
    private boolean active;
    static int totalEmployees;

    static{
       Employee.totalEmployees=1000;
    }
    {
        accessCode=0;
    }

    Employee(int employeeId,int accessCode,boolean active){
        this.employeeId=employeeId;
        this.accessCode=accessCode;
        this.active=active;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(int accessCode) {
        this.accessCode = accessCode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void setTotalEmployees(int totalEmployees) {
        Employee.totalEmployees = totalEmployees;
    }

    boolean CheckAccess(int requiredPermission) {
        int adminPermission=8;
        int reportPermission=2;

        return active &&((accessCode & adminPermission)!=0 ||
                ((accessCode & reportPermission)!=0));

        }


      public void display(){
        System.out.println();
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Active: "+active);
        System.out.println("Access Code: "+accessCode);
    }
}

public class EmployeeAccess {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int employeeId=scan.nextInt();
        System.out.println("Enter the access code: ");
        int accessCode=scan.nextInt();;
        System.out.println("Active: ");
        boolean active=scan.nextBoolean();
        System.out.println("Require Permission: ");
        int requiredPermission=scan.nextInt();

        Employee e=new Employee(employeeId,accessCode,active);
        e.display();
        e.CheckAccess(requiredPermission);
        System.out.println("Access Granted:"+e.CheckAccess(requiredPermission));

        scan.close();

    }
}
