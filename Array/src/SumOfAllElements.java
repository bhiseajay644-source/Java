import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Enter the elements for index i:"+i);
			array[i]=scan.nextInt();
		}
		int sumOfElements=0;
		for(int element: array) {
			sumOfElements +=element;
		}
		System.out.println("Sum of elements of array:"+sumOfElements);
		scan.close();
	}

}
