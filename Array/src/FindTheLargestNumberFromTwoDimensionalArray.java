import java.util.Scanner;

public class FindTheLargestNumberFromTwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns:");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		System.out.println("Enter the elements for matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
			int largest=array[0][0];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
				if(array[i][j]>largest){
					largest=array[i][j];
				}
				
			}
		}
			System.out.println("The largest element from the two dimensional array is : "+largest);
		scan.close();
	}

}
