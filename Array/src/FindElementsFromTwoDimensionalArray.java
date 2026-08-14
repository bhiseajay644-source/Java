import java.util.Scanner;

public class FindElementsFromTwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the rows and coloumns: ");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		System.out.println("Enter the elements for matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the elements for search:");
		int element=scan.nextInt();
		boolean found=false;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(array[i][j]==element) {
					 found=true;
					System.out.println("The element found at row= "+i+" and coloumn "+j);
					break;
				}
			}
		}
		if(!found) {
			System.out.println("Enter the valid element for search..!");
		}
		scan.close();
	}

}
