import java.util.Scanner;

public class findingLeadersOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the elements for index:"+i);
			array[i]=scan.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			boolean leader=true;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]>array[i]){
					leader=false;
					break;
				}
			}
		
		if(leader) {
			System.out.print(array[i]+"\t");
		}
		}
		scan.close();
	}

}
