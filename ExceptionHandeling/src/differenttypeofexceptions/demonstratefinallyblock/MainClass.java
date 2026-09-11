package differenttypeofexceptions.demonstratefinallyblock;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age : ");
        String age=scan.nextLine();
        ResourceCloser.resource(age);
        scan.close();
    }
}
