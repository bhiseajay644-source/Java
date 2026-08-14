package inheritance.hospitalmanagementsystem;

import java.util.Scanner;

class Person{
    int personId;
    String name;
    int age;
    String gender;


    void readPersonDetails(int personId,String name,int age,String gender){
        this.personId=personId;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    void displayPersonDetails(){
        System.out.println();
        System.out.println("Person Id: "+personId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}

class Doctor extends Person{
    String specialization;
    double consultationFee;

    void readDoctorDetails(int personId,String name,int age, String gender,String specialization,double consultationFee){
        super.readPersonDetails(personId,name,age,gender);
        this.specialization=specialization;
        this.consultationFee=consultationFee;
    }

    void displayDoctorDetails(){
        System.out.println("Specialization: "+specialization);
        System.out.println("Consultation Fee: "+consultationFee);
        System.out.println();
    }
}

class Nurse extends Person{
    String department;
    String shift;
    int yearOfExperience;

    void readNurseDetails(int personId,String name,int age,String gender,String department,String shift,int yearOfExperience){
        super.readPersonDetails(personId,name,age,gender);
        this.department=department;
        this.shift=shift;
        this.yearOfExperience=yearOfExperience;
    }

    void displayNurseDetails(){
        System.out.println("Department: "+department);
        System.out.println("Shift: "+shift);
        System.out.println("Year of Experience: "+yearOfExperience);
        System.out.println();
    }
}

class Patient extends Person{
    String disease;
    int roomNumber;
    String admissionDate;

    void readPatientDetails(int personId,String name,int age,String gender,String disease,int roomNumber,String admissionDate){
        super.readPersonDetails(personId,name,age,gender);
        this.disease=disease;
        this.roomNumber=roomNumber;
        this.admissionDate=admissionDate;
    }

    void displayPatientDetails(){
        System.out.println("Disease: "+disease);
        System.out.println("Room Number: "+roomNumber);
        System.out.println("Admission Date: "+admissionDate);
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor d=new Doctor();
        d.readDoctorDetails(101,"Ajay",22,"Male","Operation Specialist",1000);
        d.displayPersonDetails();
        d.displayDoctorDetails();

        Nurse n=new Nurse();
        n.readNurseDetails(102,"Shweta",35,"Female","ICU Ward","7AM to 5PM",3);
        n.displayPersonDetails();
        n.displayNurseDetails();

        Patient P =new Patient();
        P.readPatientDetails(102,"Sujay",25,"Male","Cancer",3,"02-04-2026");
        P.displayPersonDetails();
        P.displayPatientDetails();
    }
}
