import java.util.Scanner;

public class FindMaximumDifference {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the element for index:"+i);
			array[i]=scan.nextInt();
		}
		int maxdifference=0;
		for(int i=0;i<array.length-1;i++) {
			int  difference=Math.abs(array[i+1]-array[i]);
			if(difference>maxdifference) {
				maxdifference=difference;
			}
		}
		System.out.println("The highest difference between two element: "+maxdifference);
		scan.close();
	}

}
