import java.util.Arrays;
import java.util.Scanner;

public class ParkingManagementSystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the elements for index:"+i);
			array[i]=scan.nextInt();
		}
		System.out.println("The car number is = ");
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				System.out.print(array[i]+"\t");
			}
		}
		scan.close();
	}

}
