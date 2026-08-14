package encapsulation.swapping;

class Employee{
    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(int employeeId, String employeeName, String designation, double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.designation=designation;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println();
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
        System.out.println();
    }

    class EmployeeUtility{
        public static void swapEmployeeDetails(Employee emp1,Employee emp2){
            int tempId=emp1.getEmployeeId();
            emp1.setEmployeeId(emp2.getEmployeeId());
            emp2.setEmployeeId(tempId);

            String tempName=emp1.getEmployeeName();
            emp1.setEmployeeName(emp2.getEmployeeName());
            emp2.setEmployeeName(tempName);

            String tempDesignation=emp1.getDesignation();
            emp1.setDesignation(emp2.getDesignation());
            emp2.setDesignation(tempDesignation);

            Double tempSalary=emp1.getSalary();
            emp1.setSalary(emp2.getSalary());
            emp2.setSalary(tempSalary);
        }
    }
}
public class SampleInputSwapping {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"Rahul","Java Developer",65000);

        Employee emp2=new Employee(102,"Priya","Software Tester",55000);

        System.out.println("---------------Before Swapping---------");
        emp1.displayDetails();
        emp2.displayDetails();
        System.out.println("------------------After Swapping---------");
        Employee.EmployeeUtility.swapEmployeeDetails(emp1,emp2);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
