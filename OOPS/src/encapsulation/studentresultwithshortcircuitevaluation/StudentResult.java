package encapsulation.studentresultwithshortcircuitevaluation;

import java.util.Scanner;

class Student{
    private int rollNo;
    private int marks;
    private boolean attendence;
    static int passMarks=40;

    Student(int rollNo,int marks,boolean attendence){
        this.rollNo=rollNo;
        this.marks=marks;
        this.attendence=attendence;
    }

     boolean isEligible(boolean attendence){
        if(attendence){
            return true;
        }else{
            return false;
        }
    }
   boolean isPassed(boolean attendence,int marks){
        if(attendence && marks>=passMarks){
            return true;
        }else{
            return false;
        }
    }
    void displayResult(){
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("Attendence: "+attendence);
        System.out.println("Passed: "+isPassed(attendence,marks));
        System.out.println("Distinction: "+isEligible(attendence));
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the rollNumber:");
        int rollNo=scan.nextInt();
        System.out.println("Enter the marks:");
        int marks=scan.nextInt();
        System.out.println("Enter the attendence:");
        boolean attendence=scan.nextBoolean();

        Student s=new Student(rollNo,marks,attendence);
        s.isEligible(attendence);
        s.isPassed(attendence,marks);
        s.displayResult();

        scan.close();
    }
}
