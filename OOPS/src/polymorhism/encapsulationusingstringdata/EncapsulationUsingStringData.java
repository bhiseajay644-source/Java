package polymorhism.encapsulationusingstringdata;

class Person{
    private String name;

    Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
    void display(){
        System.out.println("Name: "+getName().toUpperCase());
    }
}
public class EncapsulationUsingStringData {
    public static void main(String[] args) {
        Student s=new Student("Sachin");
        s.display();
    }
}
