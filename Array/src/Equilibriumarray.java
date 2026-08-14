import java.util.Scanner;

public class Equilibriumarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for array:"+i);
			array[i]=scan.nextInt();
		}
		boolean found=false;
		for(int i=0;i<size;i++) {
			int leftsum=0;
			int rightsum=0;
			for(int j=0;j<i;j++) {
				leftsum=leftsum+array[j];
			}
				for(int k=i+1;k<size;k++) {
					rightsum=rightsum+array[k];
				}
			
			if(leftsum==rightsum) {
				System.out.println("The equilibrium index is at position= "+i);
				found=true;
			}
		}
		scan.close();
	}

}
