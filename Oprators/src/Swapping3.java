import java.util.Scanner;

public class Swapping3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1= scan.nextInt();
		int num2 = scan.nextInt();
		int temp ;
		
		System.out.println("Values before swapping:");
		System.out.println(num1);
		System.out.println(num2);
		
		temp =num1 + num2;
		num1=temp - num1;
		num2 =temp - num2;
		System.out.println("Variable after swapping:");
		System.out.println(num1);
		System.out.println(num2);
		scan.close();
	}
}
