package encapsulation.employeefactory;

class Employee{
    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    void Employee(int employeeId,String employeeName,String designation,double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.designation=designation;
        this.salary=salary;
    }

    class EmployeeFac{
        static void getEmployee(){
            Employee e=new Employee();
            System.out.println("---------------- Employee Details------------");
            System.out.println();
            System.out.println("Employee Id: "+e.employeeId);
            System.out.println("Employee Name: "+e.employeeName);
            System.out.println("Designation : "+e.designation);
            System.out.println("Salary : "+e.salary);
            System.out.println();

        }
    }

}
public class EmployeeFactory {
    public static void main(String[] args) {
        Employee e=new Employee();
        Employee.EmployeeFac efc=e.new EmployeeFac();
        e.Employee(101,"Rahul","Java Developer",65000);

        Employee.EmployeeFac.getEmployee();

    }
}
