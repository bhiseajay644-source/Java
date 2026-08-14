package inheritance.personandstudentheirarchy;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    int rollNumber;
    String course;

    Student(String name,int age,int rollNumber,String course){
        super(name,age);
        this.rollNumber=rollNumber;
        this.course=course;
    }
    void displayStudentInfo(){
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Course: "+course);
    }
}
public class PersonAndStudentHeirarchy {
    public static void main(String[] args) {
        Student s=new Student("Ajay",22,23,"Full Stack Java");
        s.displayInfo();
        s.displayStudentInfo();
    }
}
