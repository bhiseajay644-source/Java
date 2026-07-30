import java.util.Scanner;

public class ConditionalOperators1 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int first=scan.nextInt();
	System.out.println("Enter the second number:");
	int second=scan.nextInt();
     String result =(first>second)?(first+" is bigger.") :(second+" is bigger.");
     System.out.println(result);
     scan.close();
	
}
}
