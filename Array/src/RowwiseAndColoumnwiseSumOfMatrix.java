import java.util.Scanner;

public class RowwiseAndColoumnwiseSumOfMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns: ");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		System.out.println("Enter the elements for the matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			int rowSum=0;
			for(int j=0;j<col;j++) {
				rowSum +=array[i][j];
			}
			System.out.println("The sum of row "+i+" = "+rowSum);
		}
		for(int j=0;j<col;j++) {
			int colSum=0;
			for(int i=0;i<row;i++) {
				colSum=colSum+array[i][j];
			}
			System.out.println("The sum of coloumn "+j+" = "+colSum);
		}
		scan.close();
	}

}
