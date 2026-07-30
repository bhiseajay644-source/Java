import java.util.Scanner;

public class LenghthOfTheArrayWithoutUsingLengthAttribute {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for index:"+i);
			array[i]=scan.nextInt();
		}
		int count=0;
		for(int element:array) {
			count++;
		}
		System.out.println("The length of the array:"+count);
		scan.close();
	}

}
