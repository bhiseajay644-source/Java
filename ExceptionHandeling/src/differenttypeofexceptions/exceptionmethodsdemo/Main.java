package differenttypeofexceptions.exceptionmethodsdemo;

import java.util.Scanner;

class ExceptionMethodsDemo{
    public void devide(int x,int y) throws ArithmeticException{
        int z=x/y;
        System.out.println(z);
    }
}
public class Main {
    public static void main(String[] args) {
        ExceptionMethodsDemo demo=new ExceptionMethodsDemo();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int first=scan.nextInt();
        System.out.println("Enter the second value: ");
        int second=scan.nextInt();

        try{
            demo.devide(first,second);
        }catch(Exception e){

            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
