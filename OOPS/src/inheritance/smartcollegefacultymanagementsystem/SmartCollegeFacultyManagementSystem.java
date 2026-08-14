package inheritance.smartcollegefacultymanagementsystem;

class Employee{
    int employeeId;
    String employeeName;
    double salary;
    String department;

    void acceptEmployeeDetails(int employeeId,String employeeName,double salary,String department){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
        this.department=department;
    }

    void displayEmployeeDetails(){
        System.out.println("============== College Management System===========");
        System.out.println();
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }
}

class Professor extends Employee{
    String subject;
    String qualification;
    int experience;

    void acceptProfessorDetails(String subject,String qualification,int experience){
        this.subject=subject;
        this.qualification=qualification;
        this.experience=experience;
    }
    void displayProfessorDetails(){
        System.out.println("Subject: "+subject);
        System.out.println("Qualification: "+qualification);
        System.out.println("Experience: "+experience);
    }
}
public class SmartCollegeFacultyManagementSystem {
    public static void main(String[] args) {
        Professor p=new Professor();
        p.acceptEmployeeDetails(101,"Vijay",55000.0,"M.tech in Math");
        p.displayEmployeeDetails();
        p.acceptProfessorDetails("Math","Graduate in M.tech",10);
        p.displayProfessorDetails();
    }
}
