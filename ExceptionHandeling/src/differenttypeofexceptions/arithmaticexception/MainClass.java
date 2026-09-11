package differenttypeofexceptions.arithmaticexception;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Numerator: ");
        int numerator=scan.nextInt();
        System.out.println("Enter the Denominator: ");
        int denominator=scan.nextInt();

        Test.DivisionHandler(numerator,denominator);
        scan.close();
    }
}
