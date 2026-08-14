package encapsulation.objectcloning;
import java.util.Scanner;

class Student{
    private int studentId;
    private String studentName;
    private int marks;
    private String course;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    Student(int studentId, String studentName, int marks, String course){
        this.studentId=studentId;
        this.studentName=studentName;
        this.marks=marks;
        this.course=course;
    }

    Student(Student s1){
        this.studentId=s1.studentId;
        this.studentName=s1.studentName;
        this.marks=s1.marks;
        this.course=s1.course;

    }

    void displayDetails(){
        System.out.println("--------------- Student Information-------------");
        System.out.println("Student Id: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Marks: "+marks);
        System.out.println("Student Course: "+course);
    }

}
public class ObjectClone {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Student s1=new Student(101,"Rahul",92,"Java Full Stack");

        Student s2=new Student(s1);
        s1.displayDetails();
        s2.displayDetails();

        System.out.println("Enter new name:");
        String newName=scan.nextLine();
        System.out.println("Enter the course:");
        String newCourse=scan.nextLine();
        System.out.println("Enter the marks: ");
        int newMarks=scan.nextInt();
        s2.setStudentName(newName);
        s2.setCourse(newCourse);
        s2.setMarks(newMarks);
        s1.displayDetails();
        s2.displayDetails();


    }
}
