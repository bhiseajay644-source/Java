package abstractionencapsulation;

abstract class Employee{
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    Employee(int employeeId,String employeeName,double basicSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.basicSalary=basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    abstract double calculateSalary();
}

class PermanentEmployee extends Employee{
    PermanentEmployee(int employeeId,String employeeName,double basicSalary){
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    double calculateSalary() {
        double finalSalary=getBasicSalary()*0.2+getBasicSalary()*0.1+getBasicSalary();
       System.out.println(getEmployeeId()+" "+getEmployeeName()+"->"+"Final salary: "+finalSalary);
        return finalSalary;
    }
}

class ContractEmployee extends Employee{
    ContractEmployee(int employeeId,String employeeName,double basicSalary){
        super(employeeId, employeeName, basicSalary);
    }

    @Override
    double calculateSalary() {
        double finalSalary=getBasicSalary()+2000-500;
       System.out.println(getEmployeeId()+" "+getEmployeeName()+"->"+"Final salary: "+finalSalary);
        return finalSalary;
    }
}

public class EmployeePayrollProcessor {
    public static void main(String[] args) {
        Employee[] emp=new Employee[]{
                new PermanentEmployee(101,"Ravi",30000),new ContractEmployee(102,"Sita",25000)
        };
            double totalPayroll=0;
        for(Employee employee:emp){
            double salary= employee.calculateSalary();
            totalPayroll=totalPayroll+ salary;
        }
        System.out.println("Total Payroll: "+totalPayroll);

    }
}
