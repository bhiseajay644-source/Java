package polymorhism.encapsulationusinganintegerfield;

class Employee{
    private int salary;

    Employee(int salary){
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid salary..!");
        }
    }
}
class Manager extends Employee{
    Manager(int salary){
        super(salary);
    }
    void display(){
        System.out.println("Salary: "+getSalary());
    }
}
public class EncapsulationUsingAnIntegerField {
    public static void main(String[] args) {
        Manager m=new Manager(60000);
        m.display();
    }
}
