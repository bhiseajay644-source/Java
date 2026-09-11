package abstractionss;

abstract class Exam{
    String studentName;
    int marks;
    Exam(String studentName,int marks){
        this.studentName=studentName;
        this.marks=marks;
    }
    abstract void evaluateResult();
}

class Objective extends Exam{
    Objective(String studentName,int marks){
        super(studentName, marks);
    }

    void evaluateResult(){
        if(marks>=35){
            System.out.println("Objective Exam: Pass");
        }else{
            System.out.println("Objective Exam: Fail");
        }
    }
}

class Practical extends Exam{
    Practical(String studentName,int marks){
        super(studentName, marks);
    }

    void evaluateResult(){
        if(marks>=40){
            System.out.println("Practical Exam : Pass ");
        }else{
            System.out.println("Practical Exam: Fail");
        }
    }
}

class Coding extends Exam{
    Coding(String studentName,int marks){
        super(studentName, marks);
    }

    void evaluateResult(){
        if(marks>=50){
            System.out.println("Coding Exam : Pass");
        }else{
            System.out.println("Coding Exam : Fail");
        }
    }
}
public class OnlineExaminationResultSystem {
    public static void main(String[] args) {
        Exam e;
        e=new Objective("Ajay", 45);
        e.evaluateResult();
        e=new Practical("Ajay",45);
        e.evaluateResult();
        e=new Coding("Ajay",45);
        e.evaluateResult();

    }
}
