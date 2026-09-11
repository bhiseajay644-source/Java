package polymorhism.runtimepolymorphismwithstringarrays;

class Employee{
    String[] skills;

    Employee(String[] skills){
        this.skills=skills;
    }

    void processSkills(String[] skills){
        System.out.println("Runtime Polymorphism..!");
    }
}
class Developer extends Employee{
    Developer(String[] skills){
        super(skills);
    }
    void processSkills(String[] skills){
        System.out.println("Development skills");
        for(String skill: skills){
            System.out.println(skill);
        }
    }
}

class Tester extends Employee{
    Tester(String[] skills){
        super(skills);
    }
    void processSkills(String[] skills){
        System.out.println("Testing skills");
        for(String skill: skills){
            System.out.println(skill);
        }
    }
}
public class RunTimePolymorphismWithStringArrays {
    public static void main(String[] args) {
        String[] arr={"java","Spring","Sql"};
        String[] arr1={"Agile","Waterfall Model","SDLC"};
        Employee e;
        e=new Developer(arr);
        e.processSkills(arr);
    }
}
