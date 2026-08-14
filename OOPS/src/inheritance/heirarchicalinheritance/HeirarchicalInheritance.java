package inheritance.heirarchicalinheritance;


class Person{
    String name;
    int age;
    long mobile;

    Person(String name, int age,long mobile){
        this.name=name;
        this.age=age;
        this.mobile=mobile;
    }

    void displayPersonDetails(){
        System.out.println();
        System.out.println("Person Name: "+name);
        System.out.println("Person Age: "+age);
        System.out.println("Person MObile Number: "+mobile);
    }
}

class Doctor extends Person{
    String specialization;

     Doctor(String name, int age, long mobile,String specialization){
        super(name,age,mobile);
        this.specialization=specialization;
    }

    void displayDeoctorDetails(){

        System.out.println("Specialization IN: "+specialization);
        System.out.println();
    }
}

class Patient extends Person{
    String disease;

     Patient(String name, int age, long mobile,String disease){
        super(name,age,mobile);
        this.disease=disease;
    }
    void displayPatientDetails(){
        System.out.println("Patient Disease: "+disease);
        System.out.println();
    }
}

class Nurse extends Person{
    String department;

     Nurse(String name, int age, long mobile,String department){
        super(name,age,mobile);
        this.department=department;
    }

    void displayNurseDetails(){
        System.out.println("Department: "+department);
        System.out.println();
    }
}

public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Doctor d=new Doctor("Ajay",35,3892847,"Operation Specialist");
        d.displayPersonDetails();
        d.displayDeoctorDetails();
        Patient p=new Patient("Sujay",22,329303749,"Cancer");
        p.displayPersonDetails();
        p.displayPatientDetails();
        Nurse n=new Nurse("Sujata",18,78447484,"ICU Special Ward");
        n.displayPersonDetails();
        n.displayNurseDetails();
    }
}
