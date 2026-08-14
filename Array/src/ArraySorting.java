import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		int[] num=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for the index:"+i);
			num[i]=scan.nextInt();
		}
		Arrays.sort(num);
		int largest=0;
		int difference=0;
		for(int i=0;i<num.length-1;i++) {
			difference=num[i+1]-num[i];
			if(difference>largest) {
				largest=difference;
			}
		}
		System.out.println("The maximum difference"
				+ " between two consecutive element= "+largest);
		scan.close();
		
	}

}
