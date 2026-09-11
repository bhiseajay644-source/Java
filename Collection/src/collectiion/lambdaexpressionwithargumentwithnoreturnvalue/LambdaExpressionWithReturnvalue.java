package collectiion.lambdaexpressionwithnoargumentandreturnvalue;


interface Add{
    void nums(int a,int b);
}
public class LambdaExpressionWithReturnvalue {
    public static void main(String[] args) {
        Add a=(x,y)-> System.out.println("Sum: "+(x+y));
        a.nums(10,20);
    }
}
