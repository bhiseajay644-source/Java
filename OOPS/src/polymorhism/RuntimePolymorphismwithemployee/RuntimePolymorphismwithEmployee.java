package polymorhism.RuntimePolymorphismwithemployee;

class Employee{
    public void work(){
        System.out.println("Employee is Working.");
    }
}
class Developer extends Employee{
    public void work(){
        System.out.println("Developer is coding");
    }
}
class Manager extends Employee{
    public void work(){
        System.out.println("Manager is managing");
    }
}
class Tester extends Employee{
    public void work(){
        System.out.println("Tester is testing.");
    }
}
public class RuntimePolymorphismwithEmployee {
    public static void main(String[] args) {
        Employee e=new Employee();

        e=new Developer();
        e.work();
        e=new Tester();
        e.work();
        e=new Manager();
        e.work();
    }
}
