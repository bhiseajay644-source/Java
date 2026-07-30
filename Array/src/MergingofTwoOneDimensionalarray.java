import java.lang.reflect.Array;
import java.util.Scanner;

public class MergingofTwoOneDimensionalarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int size=scan.nextInt();
		int[] array1=new int [size];
		
		for(int i=0;i<array1.length;i++) {
			System.out.println("Enter the elements for index:"+i);
			array1[i]=scan.nextInt();
		}
		System.out.println("Enter the size of the second array:");
		int size1=scan.nextInt();
		int[] array2=new int[size1];
		for(int i=0;i<array2.length;i++) {
			System.out.println("Enter the elements for index:"+i);
			array2[i]=scan.nextInt();
		}
		int[] array3=new int[size+size1];
		for(int i=0;i<size;i++) {
			array3[i]=array1[i];
		}
		for(int i=0;i<size1;i++) {
			array3[size+i]=array2[i];
		}
		System.out.println("Merged array:");
		for(int element:array3) {
			System.out.print(element+"\t");
		}
		scan.close();
	}

}
