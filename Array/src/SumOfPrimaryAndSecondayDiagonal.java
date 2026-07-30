import java.util.Scanner;

public class SumOfPrimaryAndSecondayDiagonal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows and coloumns:");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		System.out.println("Enter the element for matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		int primarySum=0;
		int secondarySum=0;
		int n=array.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					primarySum +=array[i][j];
					secondarySum +=array[i][n-1-i];
				}
			}
		}
		System.out.println("The primary  sum of diagonal:"+primarySum);
		System.out.println("The secondary sum of diagonal :"+secondarySum);
		scan.close();
	}

}
