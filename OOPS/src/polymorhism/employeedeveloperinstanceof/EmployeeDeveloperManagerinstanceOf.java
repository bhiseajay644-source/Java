package polymorhism.employeedeveloperinstanceof;

class Employee{

}
class Developer extends Employee{
    void develop(){
        System.out.println("Developer coding...");
    }
}
class Manager extends Employee{
    void manage(){
        System.out.println("Manager managing...");
    }
}
public class EmployeeDeveloperManagerinstanceOf {
    public static void main(String[] args) {
        Employee emp=new Developer();

        if(emp instanceof Developer){
            System.out.println("Object is Developer");
        } else if (emp instanceof Manager) {
            System.out.println("Object is Manager");
        }else {
            System.out.println("Object is Employee");
        }
    }
}
