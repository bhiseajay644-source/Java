import java.util.Scanner;

public class ConditionalOperator2 {
	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the number");
	int number=scan.nextInt();
	String result=(number % 2==0)?(number+" number is even."):(number+" number is odd.");
	System.out.println(result);
	scan.close();
}
}
