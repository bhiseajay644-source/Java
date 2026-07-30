import java.util.Scanner;

public class PrintMissingElementsFromArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size =scan.nextInt();
		int[] array=new int[size];
		
		int max=0;
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the elements for index:"+i);
			array[i]=scan.nextInt();
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Missing elements:");
		for(int i=1;i<=max;i++) {
			boolean found=false;
			for(int j=0;j<size;j++) {
				if(array[j]==i) {
					found=true;
					break;
				}
			}
		
		if(!found) {
			System.out.print(i+"\t");
		}
		}
		scan.close();
	}

}
