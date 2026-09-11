package differenttypeofexceptions.arrayoutofbondexception;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size ,index and devisor :");
        int size=scan.nextInt();
        int index=scan.nextInt();
        int devisor=scan.nextInt();

        ArrayDevider.array(index,size,devisor);
        scan.close();
    }
}
