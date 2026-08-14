package inheritance.universityportalsystem;


class Person{
    int personId;
    String name;
    int age;
    String gender;

    Person(int personId,String name,int age,String gender){
        this.personId=personId;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    void displayDetails()
    {
        System.out.println("Person Id: "+personId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println();
    }
}
class Employee extends Person{
    int employeeId;
    String department;

    Employee(int personId,String name,int age,String gender,int employeeId,String department){
        super(personId, name, age, gender);
        this.employeeId=employeeId;
        this.department=department;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Department: "+department);
        System.out.println();
    }
}

class Professor extends Person{
    String specialization;
    double salary;

    Professor(int personId,String name,int age,String gender,String specialization,double salary){
        super(personId, name, age, gender);
        this.specialization=specialization;
        this.salary=salary;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization: "+specialization);
        System.out.println("Salary: "+salary);
        System.out.println();
    }
}

class Student extends Person{
    int rollNumber;
    String course;

    Student(int personId,String name,int age,String gender,int rollNumber,String course){
        super(personId, name, age, gender);
        this.rollNumber=rollNumber;
        this.course=course;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Course: "+course);
        System.out.println();
    }
}

class ReasearchStudent extends Student{
    String reasearchTopic;
    String guideName;

    ReasearchStudent(int personId,String name,int age,String gender,int rollNumber,String course,String reasearchTopic,String guideName){
        super(personId, name, age, gender, rollNumber, course);
        this.reasearchTopic=reasearchTopic;
        this.guideName=guideName;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Reasearch Topic: "+reasearchTopic);
        System.out.println("Guide Name: "+guideName);
        System.out.println();
    }
}
public class UniversityPortalSystem {
    public static void main(String[] args) {
        Professor p=new Professor(101,"Dr.Rajesh Sharma",48,"Male","Artificial Intelligence",120000);
        p.displayDetails();
        ReasearchStudent rs=new ReasearchStudent(201,"Rahul Verma",24,"Male",2225,"M.Tech","Machine Learning in HealthCare","Dr.Priya Singh");
        rs.displayDetails();

    }
}
