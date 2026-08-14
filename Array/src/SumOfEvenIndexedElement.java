import java.util.Scanner;

public class SumOfEvenIndexedElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the elements for index:"+i);
			array[i]=scan.nextInt();
		}
		int index=0;
		int sumOfEvenElement=0;
		for(int element:array) {
			if(index%2==0) {
				sumOfEvenElement +=element;
			}
			index++;
		}
		System.out.println("The sum of even Indexed element:"+sumOfEvenElement);
		scan.close();
	}

}
