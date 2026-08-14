package inheritance.smartbankemployeemanagementsystem;

class Employee{
    int employeeId;
    String employeeName;
    String department;
    double salary;

    void acceptEmployeeDetails(int employeeId,String employeeName,String department,double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.department=department;
        this.salary=salary;
    }

    void displayEmployeeDetails(){
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Empolyee Name: "+employeeName);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    String branchName;
    String incentive;
    int teamSize;

    void acceptManagerDetails(String branchName,String incentive,int teamSize){
        this.branchName=branchName;
        this.incentive=incentive;
        this.teamSize=teamSize;
    }

    void displayManagerDetails(){
        System.out.println("Branch Name: "+branchName);
        System.out.println("Incentive: "+incentive);
        System.out.println("Team Size: "+teamSize);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.acceptEmployeeDetails(101,"Sujay","Developer",50000.00);
        m.displayEmployeeDetails();
        m.acceptManagerDetails("Operational","15%",20);
        m.displayManagerDetails();
    }
}
