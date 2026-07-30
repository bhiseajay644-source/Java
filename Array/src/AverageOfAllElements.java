import java.util.Scanner;

public class AverageOfAllElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the elements for array:"+i);
			array[i]=scan.nextInt();
		}
		int sumOfElements=0;
		for(int element:array) {
			sumOfElements +=element;
		}
		int average=sumOfElements/array.length;
		System.out.println("Average of all elements:"+average);
		scan.close();
	}

}
