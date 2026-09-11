package polymorhism.staticpolymorphismusingdifferentdatatypes;

class Account{
     static void calculate(int a,int b){
        System.out.println("Integer Result: "+(a*b));
    }
    static void calculate(double a,double b){
        System.out.println("Double Result: "+(a*b));
    }
    static void calculate(long a,long b){
        System.out.println("Long Result: "+(a*b));
    }
}
public class StaticPolymorphismUsingDifferentDatatypes {
    public static void main(String[] args) {
        Account.calculate(15,20);
        Account.calculate(15.23,20.23);
        Account.calculate(1500,2000);
    }
}
