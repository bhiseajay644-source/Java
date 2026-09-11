package abstractionencapsulation;

abstract class Question{
    private String questionId;
    private String questionText;
    private int marks;

    Question(String questionId,String questionText,int marks){
        this.questionId=questionId;
        this.questionText=questionText;
        this.marks=marks;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getMarks() {
        return marks;
    }

    abstract int evaluateAnswer(String answere);
}

class Mcq extends Question{
        String correctOption;
    Mcq(String questionId, String questionText, int marks,String correctOption) {
        super(questionId, questionText, marks);
        this.correctOption=correctOption;
    }

    @Override
    int evaluateAnswer(String answere) {
        int marks=getMarks();
        if(answere==null || answere.isEmpty()){
            return 0;
        }

        if(answere.equalsIgnoreCase(correctOption)){
            return marks;
        }
            return 0;

    }
}

class TrueFalse extends Question{
    String correctAnswere;

    TrueFalse(String questionId,String questionText,int marks,String correctAnswere){
        super(questionId, questionText, marks);
        this.correctAnswere=correctAnswere;
    }

    @Override
    int evaluateAnswer(String answere) {
        int marks=getMarks();
        if(correctAnswere==null || correctAnswere.isEmpty() ){

            return 0;
        }

        if(correctAnswere.equalsIgnoreCase("True")||
        correctAnswere.equalsIgnoreCase("False")){

            return marks;
        }
            return 0;

    }
}
public class OnlineExaminationEvaluation {
    public static void main(String[] args) {
        Question[] questions=new Question[]{
                new Mcq("Q1","B",2,"B"),new Mcq("Q2","A",3,"B"),new TrueFalse("Q3","true",2,"true"),new TrueFalse("Q4","false",3,"")
        };
        String[] answere={
                "B","A","true",""
        };
        int totalMarks=0;
        int totalScore=0;
        for(int i=0;i< questions.length;i++){
            int score=questions[i].evaluateAnswer(answere[i]);
            totalMarks=totalMarks+questions[i].getMarks();
            totalScore=totalScore+score;

            if(answere[i]==null || answere[i].isBlank()){
                System.out.println(questions[i].getQuestionId()+"->Invalid Answer->0 marks");
            }else if(score==questions[i].getMarks()){
                System.out.println(questions[i].getQuestionId()+"->correct->"+score+"marks");
            }else{
                System.out.println(questions[i].getQuestionId()+"->wrong->0 marks");
            }

        }
        System.out.println("Final Score: "+totalScore+"/"+totalMarks);
    }
}
