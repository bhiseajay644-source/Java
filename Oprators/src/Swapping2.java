import java.util.Scanner;
public class Swapping2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("number before swapping:");
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println("number after swappiing:");
		System.out.println(num1);
		System.out.println(num2);
		scan.close();
		
	}

}
