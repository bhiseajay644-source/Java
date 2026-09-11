package polymorhism.DynamicPolymorphism;

class Employee{
public void display(){
    System.out.println("Employee is Working.");
}
}
class Developer extends Employee{
    @Override
    public void display(){
        super.display();
        System.out.println("Developer is developing");
    }
}
class Manager extends Employee{
    @Override
    public void display(){
        System.out.println("Manager is managing");
    }
}
class Tester extends Employee{
    @Override
    public void display(){
        System.out.println("Tester is testing.");
    }
}
public class DynamicPolymorphism {
    public static void main(String[] args) {
        Employee[] employees=new Employee[3];
        employees[0]=new Developer();
        employees[1]=new Tester();
        employees[2]=new Manager();
        for(Employee e: employees){
            e.display();
        }
    }
}
