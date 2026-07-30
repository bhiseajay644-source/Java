import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=scan.nextInt();
		System.out.println("Enter the coloumns of matrix:");
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		System.out.println("Enter the elements for matrix1:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the rows and coloumn: ");
		int row1=scan.nextInt();
		int col1=scan.nextInt();
		int [][] array2=new int[row1][col1];
		System.out.println("Enter the elements for second matrix:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				array2[i][j]=scan.nextInt();
			}
		}
		int[][] result=new int[row][col];
		
		if(row==row1 && col==col1) {
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array.length;j++) {
				result[i][j]=array[i][j]+array2[i][j];	
				}
			}
		}
		System.out.println("The matrix with the addition:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
