package polymorphisms.studentresultsystem;

class Student{
    private String name;
    int[] marks;

    Student(String name,int[] marks){
        this.name=name;
        this.marks=marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void calculateResult(){
        System.out.println("Student result calculations..");
    }
}

class EngineeringStudent extends Student{
    EngineeringStudent(String name,int[] marks){
        super(name,marks);
    }

@Override
    public void calculateResult(){
        double total=0;
        for(int m: marks){
            total=total+m;
        }
        double avg=total/ marks.length;

        System.out.println("Student: "+getName());
        System.out.println("Total: "+total);
        System.out.printf("Average: %.2f \n",avg);
        System.out.println("Result: "+(avg>=35? "Pass":"Fail"));
    }
}

class MedicalStudent extends Student{
    MedicalStudent(String name,int[] marks){
        super(name,marks);
    }
    @Override
    public void calculateResult(){
        double total=0;
        for(int m: marks){
            total +=m;
        }
        double avg=total/marks.length;

        System.out.println("Student: "+getName());
        System.out.println("Total: "+total);
        System.out.printf("Average: %.2f\n",avg);
        System.out.println("Result: "+(avg>=35 ? "Pass": "Fail"));
    }
}
public class StudentResultSystem {
    public static void main(String[] args) {
        int[] marks={66,65,77};
        EngineeringStudent s1=new EngineeringStudent("Sachin",marks);
        s1.calculateResult();
    }
}
