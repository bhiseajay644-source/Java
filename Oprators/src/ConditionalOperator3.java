import java.util.Scanner;

public class ConditionalOperator3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scan.nextInt();
		String result=(number>=0)?(number+" is positive."):(number+" is negetive.");
		System.out.println(result);
		scan.close();
	}
}
