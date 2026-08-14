import java.util.Scanner;

public class ConditionalOperator4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first number:");
		int first = scan.nextInt();
		System.out.println("Enter the second number:");
		int second = scan.nextInt();
		int result=(first<second)?(first+second):(first-second);
		System.out.println(result);
		scan.close();
		
	}
}
