import java.util.Scanner;

public class CheckMatrixAreEqual {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the rows and coloumns for first matrix:");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] arr1=new int[row][col];
		System.out.println("Enter the elements for matrix one:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the rows and coloumns for second matrix:");
		int row1=scan.nextInt();
		int col1=scan.nextInt();
		int[][] arr2=new int[row1][col1];
		System.out.println("Enter the elements for second matrix:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		if(row==row1 && col==col1) {
			boolean correct=true;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(arr1[i][j]!=arr2[i][j]){
						correct=false;
						break;
					}
				}
				if(correct) {
					System.out.println("The matrices are equal..");
				}
			}
		}else {
			System.out.println("Matrix is not equal..!");
		}
		scan.close();
	}

}
