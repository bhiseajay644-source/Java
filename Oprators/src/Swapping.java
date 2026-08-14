import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("values before swapping:");
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1 + num2;
		num2=num1 - num2;
		num1=num1 - num2;
		System.out.println("result after swapping:");
		System.out.println(num1);
		System.out.println(num2);
		scan.close();
	}
}
