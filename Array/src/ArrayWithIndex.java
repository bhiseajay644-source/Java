import java.util.Scanner;

public class ArrayWithIndex {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++){
			System.out.println("Enter the elements for index:"+i);
			array[i]=scan.nextInt();
		}
		int i=0;
		while(i<array.length) {
			System.out.println("Array with index "+i+"= "+array[i]);
			i++;
		}
		scan.close();
	}

}
