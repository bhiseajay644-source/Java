package encapsulation.calculatorapplication;

class Calculator{
    int number;

    void setNumber(int number){
        this.number=number;
    }
    void displayCalculatorApplication(){
        System.out.println("Welcome to Calculator Application");
        System.out.println();
        System.out.println("Entered Number : "+number);
    }
}
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setNumber(250);
        c.displayCalculatorApplication();
    }
}
