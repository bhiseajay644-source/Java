package differenttypeofexceptions.classcast;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age :");
        String age=sc.nextLine();
        Test.ageConverter(age);
        sc.close();
    }
}
