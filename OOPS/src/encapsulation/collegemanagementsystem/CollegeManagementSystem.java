package encapsulation.collegemanagementsystem;

import java.util.concurrent.Callable;

class College{
    int studentId;
    String studentName;
    String branch;
    static String collegeName="ABC Engineering College";
    void setStudentInfo(int studentId,String studentName,String branch){
        this.studentId=studentId;
        this.studentName=studentName;
        this.branch=branch;
    }
    void displayDetails(){
        System.out.println();
        System.out.println("Student Id : "+studentId);
        System.out.println("Student Name : "+studentName);
        System.out.println("Branch : "+branch);

    }
}
public class CollegeManagementSystem {
    public static void main(String[] args) {
        System.out.println("College Name: "+College.collegeName);
        College c=new College();
        c.setStudentInfo(101,"Rahul","CSE");
        c.displayDetails();
        College c1=new College();
        c1.setStudentInfo(102,"Priya","ECE");
        c1.displayDetails();
        College c2=new College();
        c2.setStudentInfo(103,"David","AIML");
        c2.displayDetails();
    }
}
