package inheritance.employeepayrollsystem;

class Employee{
    int employeeId;
    String employeeName;
    String department;

    void readEmployeeDetails(int employeeId,String employeeName,String department){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.department=department;
    }
    double calcualteSalary(){
        return 0;
    }

    void displayEmployeeDetails(){
        System.out.println();
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Department: "+department);
    }
}

class FullTimeEmployee extends Employee{
    double basicSalary;
    double houseRentAllowance;
    double medicalAllowance;

    void readFulltime(double basicSalary,double houseRentAllowance,double medicalAllowance){
        this.basicSalary=basicSalary;
        this.houseRentAllowance=houseRentAllowance;
        this.medicalAllowance=medicalAllowance;
    }

    @Override
    void readEmployeeDetails(int employeeId, String employeeName, String department) {
        super.readEmployeeDetails(employeeId, employeeName, department);
    }

    @Override
    double calcualteSalary() {
        return super.calcualteSalary();
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
    }

    double calaculateSalary(){
        double totalsalary=basicSalary+houseRentAllowance+medicalAllowance;
        return totalsalary;
    }

    void displayfulltimeEmployeeDetails(){
        System.out.println("Basic salary: "+basicSalary);
        System.out.println("House Rent Allowance: "+houseRentAllowance);
        System.out.println("Medical Allowance: "+medicalAllowance);
        System.out.println("Salary: "+calaculateSalary());
    }
}

class PartTimeEmployee extends Employee{
    double hoursWorked;
    double hourlyRate;

    void readParttimeEmployee(double hoursWorked,double hourlyRate){
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    void readEmployeeDetails(int employeeId, String employeeName, String department) {
        super.readEmployeeDetails(employeeId, employeeName, department);
    }

    @Override
    double calcualteSalary() {
        return super.calcualteSalary();
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
    }

    double calculateSalary(){
        double parttotalsalary=hoursWorked*hourlyRate;
        return parttotalsalary;
    }
    void displayParttimeEmployeeDetails(){
        System.out.println("Working Hours: "+hoursWorked);
        System.out.println("Rate Per Hours:"+hourlyRate);
        System.out.println("Salary: "+calculateSalary());
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee ft=new FullTimeEmployee();
        ft.readEmployeeDetails(101,"Ajay","Developer");
        ft.displayEmployeeDetails();
        ft.readFulltime(5000,10000,20000);
        ft.calaculateSalary();
        ft.displayfulltimeEmployeeDetails();
        PartTimeEmployee pt=new PartTimeEmployee();
        pt.readEmployeeDetails(102,"Sujay","Tester");
        pt.displayEmployeeDetails();
        pt.readParttimeEmployee(10,150);
        pt.calculateSalary();
        pt.displayParttimeEmployeeDetails();

    }

}
