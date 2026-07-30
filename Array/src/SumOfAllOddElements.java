import java.util.Scanner;

public class SumOfAllOddElements {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int size=scan.nextInt();
			int[] array=new int[size];
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Enter the elements for array:"+i);
				array[i]=scan.nextInt();
			}
			int sumOfOddElements=0;
			for(int element:array) {
				if(element%2!=0) {
					sumOfOddElements +=element;
				}
			}
			System.out.println("Sum of all odd elements of arrays:"+sumOfOddElements);
			scan.close();
	}

}
