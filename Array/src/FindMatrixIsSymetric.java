import java.util.Scanner;

public class FindMatrixIsSymetric {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows and cols of the matrix:");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		int[][] transpose=new int[col][row];
		System.out.println("Enter the elements for matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		System.out.println("Traversing for the transpose:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				transpose[j][i]=array[i][j];
			}
		}
		System.out.println("The transpose matrix:");
		for(int[] i:transpose) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		boolean isSymetric=true;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(array[i][j]!=transpose[i][j]) {
					isSymetric=false;
					break;
				}
			}
		}
		if(isSymetric) {
			System.out.println("The matrix is symetric.");
		}else {
			System.out.println("The matrix is not symetric.");
		}
		scan.close();
	}

}
