package encapsulation.studentresultcalculator;

class Student{
  private  String studentName;
    private int mark1;
    private int mark2;
    private int mark3;
  private int calculateTotalMark;
  private int average;
  private String result;
    void setStudentData(String studentName,int mark1,int mark2,int mark3){
      this.studentName=studentName;
      this.mark1=mark1;
      this.mark2=mark2;
      this.mark3=mark3;

    }
    void caluculatTotal(){
      calculateTotalMark=this.mark1+this.mark2+this.mark3;
    }
void calculateAverage(){
      this.average=this.calculateTotalMark/3;
}
void calculateResult(){
      if(average>35){
        result="Pass";
      }else{
        result="Fail";
      }
}
void display(){
  System.out.println("--------------------------------------------");
  System.out.println("Student Name: "+studentName);
  System.out.println("Total Marks: "+calculateTotalMark);
  System.out.println("Average: "+average);
  System.out.println();
  System.out.println("Result: "+result);
}
}

public class StudentDemo {
  public static void main(String[] args) {
    Student s=new Student();
    s.setStudentData("Ajay",50,60,70);
    s.caluculatTotal();
    s.calculateAverage();
    s.calculateResult();
    s.display();
  }
}
