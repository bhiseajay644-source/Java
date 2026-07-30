import java.util.Scanner;

public class ConditionalOwelProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = scan.nextLine().toLowerCase().charAt(0);
		String result=(ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u')? "it is the vowel": "it is not vowel";
		System.out.println(result);
		scan.close();
	}

}
