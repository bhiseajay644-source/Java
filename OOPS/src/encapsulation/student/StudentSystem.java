package encapsulation.student;

class Student{
    int rollNumber;
    String studentName;
    String course;
    int marks;
   static int count=1;
    void setStudentData(int rollNumber,String studentName,String course,int marks){
        this.rollNumber=rollNumber;
        this.studentName=studentName;
        this.course=course;
        this.marks=marks;

    }
    void displayStudent(){
        System.out.println("---------------Student "+count+"----------------");
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Name        : "+studentName);
        System.out.println("Course      : "+course);
        System.out.println("Marks       : "+marks);
        System.out.println();
        count++;
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudentData(101,"Rahul","java",92);
        s1.displayStudent();
        Student s2=new Student();
        s2.setStudentData(102,"Priya","Python",88);
        s2.displayStudent();
        Student s3=new Student();
        s3.setStudentData(103,"David","Spring Boot",95);
        s3.displayStudent();
    }
}
