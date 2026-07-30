import java.util.Scanner;

public class CountOfSmallerNumberAfterSelf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for tha index:"+i);
			array[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					count++;
				}
			}
			System.out.print(count+"\t");
		}
		scan.close();
	}

}
