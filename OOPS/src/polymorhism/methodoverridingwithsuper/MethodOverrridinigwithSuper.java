package polymorhism.methodoverridingwithsuper;

class Employee{
    public void work(){
        System.out.println("Employee is Working");
    }
}
class Developer extends Employee{
    public void work(){
        super.work();
        System.out.println("Developer Coding");
    }
}
public class MethodOverrridinigwithSuper {
    public static void main(String[] args) {
        Employee e=new Developer();
        e.work();
    }
}
