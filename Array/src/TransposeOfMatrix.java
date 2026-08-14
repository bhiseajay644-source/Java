import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns: ");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		int[][] result=new int[col][row];
		
		System.out.println("Enter the elements for the matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		System.out.println("The given matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				result[j][i]=array[i][j];
			}
		}
		System.out.println("The transpose matrix:");
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
