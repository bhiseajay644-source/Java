package differenttypeofexceptions.propogationdemo;

import java.util.Scanner;

class PropogationDemo{
    public void devide(int x,int y) throws ArithmeticException{
        int z=x/y;
        System.out.println(z);
    }
}
public class Propogation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value devident :");
        int first=scan.nextInt();
        System.out.println("Enter the value of devider: ");
        int second=scan.nextInt();
        PropogationDemo pro=new PropogationDemo();
        try{
            pro.devide(first,second);
        }catch (ArithmeticException ex){
            System.out.println("Exception handled: "+ex.getMessage());
        }
    }
}
