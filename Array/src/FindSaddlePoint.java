import java.util.Scanner;

public class FindSaddlePoint {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows and coloumns for matrix:");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		
		System.out.println("Enter the element for matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			int minRowValue=array[i][0];
			int index=0;
			for(int j=0;j<col;j++) {
				if(array[i][j]<minRowValue){
					minRowValue=array[i][j];
					index=j;
				}
			}
			boolean isSaddle=true;
			for(int k=0;k<row;k++) {
				if(array[k][index]>minRowValue){
					isSaddle=false;
					break;
				}
			}
			if(isSaddle) {
				System.out.println("The saddle point= "+minRowValue);
		}
		}
		scan.close();
		
	}

}
